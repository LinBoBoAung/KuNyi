package com.padcmyanmar.kunyi.adapters

import android.content.Context
import android.view.ViewGroup
import com.padcmyanmar.kunyi.FacebookRegisterAcitivity
import com.padcmyanmar.kunyi.R
import com.padcmyanmar.kunyi.datas.vos.JobVO
import com.padcmyanmar.kunyi.delegates.JobDetailDelegate
import com.padcmyanmar.kunyi.views.holders.BaseJobViewholder
import com.padcmyanmar.kunyi.views.holders.JobViewholder

class JobAdapter(context: Context, private val mDelegate: JobDetailDelegate)
    : BaseJobAdapter<JobViewholder, JobVO>(context) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewholder {
        val itemView = mLayoutInflater.inflate(R.layout.viewholder_job, parent, false)
        return JobViewholder(itemView, mDelegate)
    }

}