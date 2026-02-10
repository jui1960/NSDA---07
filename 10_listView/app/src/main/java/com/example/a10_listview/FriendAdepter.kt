package com.example.a10_listview

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.a10_listview.databinding.ItemListBinding

class FriendAdepter (
    private val context : Context,
    private val friendlist: List<Friend>): BaseAdapter(){
    override fun getCount(): Int = friendlist.size

    override fun getItem(position: Int): Any? = friendlist[position]

    override fun getItemId(position: Int): Long = position.toLong()



    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
       val binding : ItemListBinding

}

