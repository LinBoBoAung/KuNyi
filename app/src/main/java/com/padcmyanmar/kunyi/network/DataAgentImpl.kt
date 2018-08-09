package com.padcmyanmar.kunyi.network

import com.google.gson.Gson
import com.padcmyanmar.kunyi.events.ErrorEvent
import com.padcmyanmar.kunyi.events.SuccessEvent
import com.padcmyanmar.kunyi.utils.Constants
import okhttp3.OkHttpClient
import org.greenrobot.eventbus.EventBus
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class DataAgentImpl {

    companion object {
        private var INSTANCE: DataAgentImpl? = null

        fun getInstance(): DataAgentImpl {
            if (INSTANCE == null) {
                INSTANCE = DataAgentImpl()
            }
            var i = INSTANCE
            return i!!
        }
    }

    private var kuNyiApi: KuNyiDataAgent

    private constructor() {
        val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build()


        val retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .client(okHttpClient)
                .build()

        kuNyiApi = retrofit.create(KuNyiDataAgent::class.java)
    }

    fun loadJobInfo(accessToken: String, page: Int) {
        val jobResponse = kuNyiApi.loadJobInfo(accessToken, page)
        jobResponse.enqueue(object : Callback<Response> {
            override fun onFailure(call: Call<Response>?, t: Throwable?) {
                EventBus.getDefault().post(ErrorEvent.ApiErrorEvent(t))
            }

            override fun onResponse(call: Call<Response>?, response: retrofit2.Response<Response>?) {
                val jobResponse: Response? = response!!.body()
                if (jobResponse != null && jobResponse.isResponseOK()) {
                    val newsLoadedEvent = SuccessEvent.JobLoadedEvent(Response().getJobInfoList()!!)
                    EventBus.getDefault().post(newsLoadedEvent)
                } else {
                    if (jobResponse != null)
                        EventBus.getDefault().post(SuccessEvent.EmptyDataLoadEvent(jobResponse.getMessage()))
                    else
                        EventBus.getDefault().post(SuccessEvent.EmptyDataLoadEvent())
                }
            }
        })
    }
}
