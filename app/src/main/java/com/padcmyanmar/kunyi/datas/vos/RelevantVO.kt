package com.padcmyanmar.kunyi.datas.vos

import com.google.gson.annotations.SerializedName

class RelevantVO(@SerializedName("relevancyPercentage") var relevancyPercentage: Double = 0.0,
                 @SerializedName("seekerId") var seekerId: Int = 0,
                 @SerializedName("seekerName") var seekerName: String = "",
                 @SerializedName("seekerProfilePicUrl") var seekerProfilePicUrl: String = "",
                 @SerializedName("seekerSkill") var seekerSkill: List<SeekerSkillVO> = ArrayList(),
                 @SerializedName("whyRelevant") var whyRelevant: String = "")