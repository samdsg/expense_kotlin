package com.example.expensalo.myadapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expensalo.R
import com.example.expensalo.models.EachExpenseTime
import kotlinx.android.synthetic.main.each__expenses.view.*

internal class EachExpenseAdapter(private var aList: ArrayList<EachExpenseTime>) :
    RecyclerView.Adapter<EachExpenseAdapter.MyViewHolder>() {

    private val viewPool = RecyclerView.RecycledViewPool()

    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        /* Title Variables */
        private val eTotal: TextView = view.e__total;
        private val eDate: TextView = view.e__date;

        private val eachList: RecyclerView = view.each__lists;

        fun bind(eachExpense: EachExpenseTime) {
            eDate.text = eachExpense.time;
            eTotal.text = "Total of expense";
        }
    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.each__expenses, parent, false)

        return MyViewHolder(itemView)
    }

    @SuppressLint("WrongConstant")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val expenseWithTime = aList[position];
        val recyclerView: RecyclerView = holder.itemView.each__lists;
        var adapter = ChildAdapter(aList[position].expense);

        val layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayout.HORIZONTAL, false)

        when (holder) {

            is MyViewHolder -> {
                holder.bind(aList[position]);
                recyclerView.adapter = adapter;
                layoutManager = layoutManager;
                }
            }
        }

    override fun getItemCount(): Int {
        return aList.size;
    }
}