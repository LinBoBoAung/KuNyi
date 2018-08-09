package com.padcmyanmar.kunyi.datas.vos

import com.google.gson.annotations.SerializedName

class JobTagVO(@SerializedName("desc") var desc: String = "",
               @SerializedName("jobCountWithTag") var jobCountWithTag: String = "",
               @SerializedName("tag") var tag: String = "",
               @SerializedName("tagId") var tagId: Int = 0)