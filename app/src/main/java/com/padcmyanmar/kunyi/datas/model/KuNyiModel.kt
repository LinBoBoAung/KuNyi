package com.padcmyanmar.kunyi.datas.model

import com.padcmyanmar.kunyi.datas.vos.JobVO
import com.padcmyanmar.kunyi.network.DataAgentImpl
import com.padcmyanmar.kunyi.utils.Constants
import org.greenrobot.eventbus.EventBus

class KuNyiModel
{
    companion object {
        private var INSTANCE: KuNyiModel? = null
        fun getInstance(): KuNyiModel {
            if (INSTANCE == null) {
                INSTANCE = KuNyiModel()
            }

            val i = INSTANCE
            return i!!
        }
    }

    private constructor() {
        EventBus.getDefault().register(this)
    }

    private var mJobData: HashMap<Int,JobVO> = HashMap()

    fun  loadJobInfo() {
       DataAgentImpl.getInstance().loadJobInfo(Constants.ACCESS_TOKEN,1)
    }


//    @Subscribe(threadMode = ThreadMode.BACKGROUND)
//    fun onLoadHealthCareEvent(HealthCareLoadedEvent: DataEvent.HealthCareLoadedEvent) {
//        for (healthCare: HealthCareInfoVO in HealthCareLoadedEvent.loadHealthEventInfo) {
//            mHealthCareData[healthCare.healthCareId] = healthCare
//        }

   // }
}