package com.padcmyanmar.kunyi.datas.vos

import com.google.gson.annotations.SerializedName

class JobDurationVO(@SerializedName("jobEndDate") var jobEndDate: String = "",
                    @SerializedName("jobStartDate") var jobStartDate: String = "",
                    @SerializedName("totalWorkingDay") var totalWorkingDay: String = "",
                    @SerializedName("workingDayPerWeek") var workingDayPerWeek: String = "",
                    @SerializedName("workingHourPerDay") var workingHourPerDay: String = "")