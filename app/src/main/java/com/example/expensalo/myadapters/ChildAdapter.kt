package com.example.expensalo.myadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expensalo.R
import com.example.expensalo.models.EachExpense

class ChildAdapter(private val children: EachExpense) :
    RecyclerView.Adapter<ChildAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.each__expenses, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val child = children[position]
//        holder.imageView.setImageResource(child.image)
//        holder.textView.text = child.title
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }
}