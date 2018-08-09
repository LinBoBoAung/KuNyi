package com.padcmyanmar.kunyi.events

import android.provider.SyncStateContract
import com.padcmyanmar.kunyi.datas.vos.JobVO
import com.padcmyanmar.kunyi.utils.Constants

class SuccessEvent
{
    class JobLoadedEvent(val loadJobInfo: List<JobVO>)
    class EmptyDataLoadEvent(val errorMsg: String? =Constants.EMPTY_BODY_RESPONSE)
}