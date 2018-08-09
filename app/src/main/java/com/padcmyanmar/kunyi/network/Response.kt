package com.padcmyanmar.kunyi.network

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.kunyi.datas.vos.JobVO

class Response {
    @SerializedName("code")
    private var code: Int = 0

    @SerializedName("message")
    private var message: String? = ""

    @SerializedName("apiVersion")
    private var apiVersion: String = ""


    @SerializedName("jobs")
    private lateinit var JobInfoList: List<JobVO>

    fun getCode(): Int? {
        return code
    }

    fun getMessage(): String? {
        return message
    }

    fun getJobInfoList(): List<JobVO>?{
        if (JobInfoList == null) {
            JobInfoList = ArrayList()

        }

        return JobInfoList!!

    }

    fun isResponseOK(): Boolean {
        return code == 200 && JobInfoList != null
    }
}