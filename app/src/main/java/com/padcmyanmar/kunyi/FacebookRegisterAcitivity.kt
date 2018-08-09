package com.padcmyanmar.kunyi

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.padcmyanmar.kunyi.adapters.JobAdapter
import com.padcmyanmar.kunyi.delegates.JobDetailDelegate
import kotlinx.android.synthetic.main.acitivity_login_facebook.*
import kotlinx.android.synthetic.main.activity_job.*
import kotlinx.android.synthetic.main.activity_main.*

class FacebookRegisterAcitivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_login_facebook)

        btnSubmit.setOnClickListener {
            val intent=Intent(this,JobActivity::class.java)
            startActivity(intent)

        }
//        btnSubmit.setOnClickListener(View.OnClickListener {
//            val intent = Intent(applicationContext, JobActivity::class.java)
//            startActivity(intent)
//        })
//



    }
}