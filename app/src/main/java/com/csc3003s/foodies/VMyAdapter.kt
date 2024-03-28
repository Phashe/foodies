package com.csc3003s.foodies

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VMyAdapter(private val userList: ArrayList<User>) :RecyclerView.Adapter<VMyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        val tvName :TextView = itemView.findViewById(R.id.User)
        val tvVendorName :TextView = itemView.findViewById(R.id.Vendorname)
        val tvRating :TextView = itemView.findViewById(R.id.RatingAverage)
        val tvComment :TextView = itemView.findViewById(R.id.WrittenComment)
        val tvreplyB : Button = itemView.findViewById(R.id.button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.vlist_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvName.text =userList[position].User
        holder.tvVendorName.text =userList[position].Vendorname
        holder.tvComment.text =userList[position].WrittenComment
        holder.tvRating.text =userList[position].RatingAverage

    }

    override fun getItemCount(): Int {
        return userList.size
    }





}