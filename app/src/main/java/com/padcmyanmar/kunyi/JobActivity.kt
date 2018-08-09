package com.padcmyanmar.kunyi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import com.padcmyanmar.kunyi.R.*
import com.padcmyanmar.kunyi.adapters.JobAdapter
import com.padcmyanmar.kunyi.datas.model.KuNyiModel
import com.padcmyanmar.kunyi.datas.vos.JobVO
import com.padcmyanmar.kunyi.delegates.JobDetailDelegate
import com.padcmyanmar.kunyi.events.SuccessEvent
import kotlinx.android.synthetic.main.activity_job.*
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class JobActivity : BaseActivity(), JobDetailDelegate {
    override fun onTapJob(jobDetail: JobVO?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    private lateinit var mJobAdapter: JobAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job)

        rvJobs.layoutManager = LinearLayoutManager(applicationContext)
        mJobAdapter = JobAdapter(applicationContext, this)
        rvJobs.adapter = mJobAdapter


        KuNyiModel.getInstance().loadJobInfo()


    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onLoadedJob(jobLoadedEvent: SuccessEvent.JobLoadedEvent)

    {
        mJobAdapter!!.appendNewData(jobLoadedEvent.loadJobInfo as MutableList<JobVO>)
    }
}

