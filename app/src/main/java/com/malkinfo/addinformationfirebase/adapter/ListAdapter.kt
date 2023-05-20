package com.malkinfo.addinformationfirebase.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.malkinfo.addinformationfirebase.R
import com.malkinfo.addinformationfirebase.model.Product
import com.malkinfo.addinformationfirebase.uitel.loadImage
import com.malkinfo.addinformationfirebase.view.DetailsActivity

class ListAdapter (var mContext:Context,var teacherList:List<Product>):
RecyclerView.Adapter<ListAdapter.ListViewHolder>()
{
    inner class ListViewHolder(var v:View): RecyclerView.ViewHolder(v){
        var imgT = v.findViewById<ImageView>(R.id.teacherImageView)
        var nameT = v.findViewById<TextView>(R.id.nameTextView)
        var priceT = v.findViewById<TextView>(R.id.priceTextView)
        var descriT = v.findViewById<TextView>(R.id.descriptionTextView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
       var infalter = LayoutInflater.from(parent.context)
        var v = infalter.inflate(R.layout.row_item,parent,false)
        return ListViewHolder(v)
    }

    override fun getItemCount(): Int =teacherList.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
       var newList = teacherList[position]
        holder.nameT.text = newList.tenSP
        holder.priceT.text = newList.giaSP.toString()
        holder.descriT.text = newList.loaiSP
        holder.imgT.loadImage(newList.anhSP)
        holder.v.setOnClickListener {

            val name = newList.tenSP
            val price = newList.giaSP.toString()
            val loaiSP = newList.loaiSP
            val imgUri = newList.anhSP

            val mIntent = Intent(mContext,DetailsActivity::class.java)
            mIntent.putExtra("NAMET",name)
            mIntent.putExtra("PRICET",price)
            mIntent.putExtra("DESCRIT",loaiSP)
            mIntent.putExtra("IMGURI",imgUri)
            mContext.startActivity(mIntent)
        }
    }
}