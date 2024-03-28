package com.csc3003s.foodies

import android.view.ViewGroup
import android.view.ViewParent
import android.view.View
import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.common.data.DataHolder
import java.text.FieldPosition

class menuAdapter(private val userList: ArrayList<Users>): RecyclerView.Adapter<menuAdapter.myViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):menuAdapter.myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.menulist_item,parent,false)
        return myViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: menuAdapter.myViewHolder, position: Int){
        val user: Users = userList[position]
        holder.itemName.text = user.name
        holder.itemContent.text = user.content
    }

    override fun getItemCount(): Int {
        return userList.size
    }
    public class myViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val itemName: TextView = itemView.findViewById(R.id.itemTitle)
        val itemContent: TextView = itemView.findViewById(R.id.itemContent)

    }
}