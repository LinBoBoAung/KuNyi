package com.padcmyanmar.kunyi.datas.vos

import com.google.gson.annotations.SerializedName

class InterestedVO(@SerializedName("interestedTimeStamp") var interstedTimeStamp: String = "",
                   @SerializedName("seekerId") var seekerId: Int = 0,
                   @SerializedName("seekerName") var seekerName: String = "",
                   @SerializedName("seekerProfilePicUrl") var seekerProfilePicUrl: String = "",
                   @SerializedName("seekerSkill") var seekerSkill: String = "")
