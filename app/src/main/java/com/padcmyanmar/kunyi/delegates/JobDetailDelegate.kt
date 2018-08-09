package com.padcmyanmar.kunyi.delegates

import com.padcmyanmar.kunyi.datas.vos.JobVO

interface JobDetailDelegate
{
    fun onTapJob(jobDetail:JobVO?)

}