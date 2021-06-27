package com.example.expensalo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.expensalo.models.EachExpense

class StatsAdapter(private val context: Context, private val stats: ArrayList<EachExpense>) :
    BaseAdapter() {

    override fun getCount(): Int {
        return stats.size;
    }

    override fun getItem(position: Int): Any {
        return position.toLong();
    }

    override fun getItemId(position: Int): Long {
        return position.toLong();
    }


    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(context);
        val expenseInfoView: View =
            layoutInflater.inflate(R.layout.expense__stats, viewGroup, false);

        val title = expenseInfoView.findViewById<TextView>(R.id.stat__title);
        val price = expenseInfoView.findViewById<TextView>(R.id.stat__price);

        /* Set items */
        title.text = stats[position].title;
        price.text = stats[position].expense;

        return expenseInfoView;
    }
}