package com.padcmyanmar.kunyi.network

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import java.util.*

interface KuNyiDataAgent {
    @FormUrlEncoded
    @POST("getJobs.php")
    fun loadJobInfo(
            @Field("access_token") accessToken: String,
            @Field("page") page: Int): Call<Response>
}