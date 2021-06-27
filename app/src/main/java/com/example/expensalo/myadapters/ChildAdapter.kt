package com.example.expensalo.myadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expensalo.R
import com.example.expensalo.models.EachExpense

class ChildAdapter(private val expenses: Any) :
    RecyclerView.Adapter<ChildAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.each__expense, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 4;
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
//        holder.imageView.setImageResource(child.image)
//        holder.textView.text = child.title
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }
}