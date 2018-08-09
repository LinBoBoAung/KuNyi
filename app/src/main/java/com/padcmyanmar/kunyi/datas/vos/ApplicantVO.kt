package com.padcmyanmar.kunyi.datas.vos

import com.google.gson.annotations.SerializedName

class ApplicantVO(
        @SerializedName("appliedDate") var appliedDate: String = "",
        @SerializedName("canLowerOfferAmount") var canLowerOfferAmount: Boolean = false,
        @SerializedName("seekerId") var seekerID: Int = 0,
        @SerializedName("seekerProfilePicUrl") var seekerProfilePicUrl: String = "",
        @SerializedName("seekerSkill") var seekerSkill: List<SeekerVO> = ArrayList(),
        @SerializedName("whyShouldHire") var whyShouldHire: List<WhyShouldHireVO> = ArrayList())
