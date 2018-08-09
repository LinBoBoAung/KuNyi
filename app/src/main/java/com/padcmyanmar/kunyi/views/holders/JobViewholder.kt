package com.padcmyanmar.kunyi.views.holders

import android.view.View
import com.padcmyanmar.kunyi.FacebookRegisterAcitivity
import com.padcmyanmar.kunyi.datas.vos.JobVO
import com.padcmyanmar.kunyi.delegates.JobDetailDelegate
import kotlinx.android.synthetic.main.detail_job.view.*
import kotlinx.android.synthetic.main.viewholder_job.view.*

class JobViewholder(itemView: View, private val mDelegate: JobDetailDelegate)
    : BaseJobViewholder<JobVO>(itemView) {
    override fun setData(data: JobVO) {
        mData = data
        itemView.tvJobTitle.text = mData!!.jobTag.toString()
        itemView.tvSalary.text = mData!!.offerAmount.toString()
        itemView.tvDescription.text = mData!!.fullDesc


    }

    override fun onClick(v: View?) {
        mDelegate.onTapJob(mData)
    }
}