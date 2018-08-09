package com.padcmyanmar.kunyi.datas.vos

import com.google.gson.annotations.SerializedName

class SeekerVO(@SerializedName("seekerId") var seekerId: Int = 0,
               @SerializedName("seekerName") var seekerName: String = "",
               @SerializedName("seekerProfilePicUrl") var seekerProfile: String = "",
               @SerializedName("seekerSkill") var seekerSkill: String = "",
               @SerializedName("viewedTimeStamp") var viewedTimeStamp: String = "")