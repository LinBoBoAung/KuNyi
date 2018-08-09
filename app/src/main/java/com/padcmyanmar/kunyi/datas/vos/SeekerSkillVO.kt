package com.padcmyanmar.kunyi.datas.vos

import com.google.gson.annotations.SerializedName

class SeekerSkillVO(@SerializedName("skillId") var skillId: String = "",
                    @SerializedName("skillName") var skillName: String = "")