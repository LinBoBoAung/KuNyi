package com.padcmyanmar.kunyi.datas.vos

import com.google.gson.annotations.SerializedName

class WhyShouldHireVO(@SerializedName("msg") var msg: String = "",
                      @SerializedName("timestamp") var timestamp: String = "",
                      @SerializedName("whyShouldHiredId") var whyShouldHireId: Int = 0)

