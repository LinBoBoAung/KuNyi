package com.padcmyanmar.kunyi.views.holders

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseJobViewholder<D>(itemview:View) : RecyclerView.ViewHolder(itemview),View.OnClickListener
{
    protected var mData:D? = null
   init
    {
        itemView.setOnClickListener(this)
    }


    abstract fun setData(data:D)

}