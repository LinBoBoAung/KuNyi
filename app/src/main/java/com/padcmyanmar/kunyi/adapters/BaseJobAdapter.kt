package com.padcmyanmar.kunyi.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.kunyi.delegates.JobDetailDelegate
import com.padcmyanmar.kunyi.views.holders.BaseJobViewholder
import java.util.zip.Inflater

open class BaseJobAdapter<VH, D>(context: Context) : RecyclerView.Adapter<BaseJobViewholder<D>>() {


    protected var mData: MutableList<D>? = null

    protected var mLayoutInflater: LayoutInflater

    init {
        mData = ArrayList()
        mLayoutInflater = LayoutInflater.from(context)
    }


    override fun onBindViewHolder(holder: BaseJobViewholder<D>, position: Int) {
        holder.setData(mData!![position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseJobViewholder<D> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getItemCount(): Int {
        return mData!!.size
    }


    fun setNewData(newData: MutableList<D>) {
        mData = newData
        notifyDataSetChanged()
    }

    fun appendNewData(newData: List<D>) {
        mData!!.addAll(newData)
        notifyDataSetChanged()
    }


}