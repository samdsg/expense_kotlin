package com.example.expensalo

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expensalo.models.EachExpense
import com.example.expensalo.models.EachExpenseTime
import com.example.expensalo.myadapters.EachExpenseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.each__expenses.*

class MainActivity : AppCompatActivity() {
    private lateinit var statsAdapter: EachExpenseAdapter;
    private val movieList = ArrayList<String>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val months: Array<String> = arrayOf(
            "JANUARY", "FEBRUARY",
            "MARCH", "APRIL",
            "MAY", "JUNE", "JULY",
            "AUGUST", "SEPTEMBER",
            "OCTOBER", "NOVEMBER",
            "DECEMBER"
        );

        /* Months Drop */
        val monthsDrop = findViewById<Spinner>(R.id.dropdown);
        monthsDrop.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, months);

        val statsInfo = findViewById<GridView>(R.id.stats__info);
        statsInfo.adapter = StatsAdapter(this, DataSource.expenseStats());

        val aList = ArrayList<EachExpenseTime>();
        aList.add(EachExpenseTime("time", EachExpense("", "Coffee", "- 4.50")));
        aList.add(EachExpenseTime("time", EachExpense("", "Suit for meeting", "- 4.50")));
        aList.add(EachExpenseTime("time", EachExpense("", "Suit for meeting", "- 4.50")));
        aList.add(EachExpenseTime("time", EachExpense("", "Suit for meeting", "- 4.50")));
        aList.add(EachExpenseTime("time", EachExpense("", "Suit for meeting", "- 4.50")));

        /* Recycler View */
        rcycle.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            statsAdapter = EachExpenseAdapter(aList);
            adapter = statsAdapter;
        }
    }
}

