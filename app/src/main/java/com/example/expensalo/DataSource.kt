package com.example.expensalo

import com.example.expensalo.models.EachExpense
import com.example.expensalo.models.EachExpenseTime

class DataSource {
    companion object {
        fun monthSet(): ArrayList<String> {

            val months = ArrayList<String>()

            months.add("JANUARY")
            months.add("FEBRUARY")
            months.add("MARCH")

            return months;
        }

        fun expensesSet(): ArrayList<EachExpenseTime> {
            val eachExpenseWithTime = ArrayList<EachExpenseTime>();

            eachExpenseWithTime.add(
                EachExpenseTime("123412", EachExpense("", "Coffee", "- 4.5"))
            )

            eachExpenseWithTime.add(
                EachExpenseTime("123412", EachExpense("", "Power bill", "- 4.5"))
            )

            eachExpenseWithTime.add(
                EachExpenseTime("123412", EachExpense("", "Veggies", "- 4.5"))
            )

            eachExpenseWithTime.add(
                EachExpenseTime("123412", EachExpense("", "Coffee", "- 4.5"))
            )

            return eachExpenseWithTime;
        }

        fun expenseStats(): ArrayList<EachExpense> {

            val eStats = ArrayList<EachExpense>();

            eStats.add(EachExpense("", "Income", "6,231.23"));
            eStats.add(EachExpense("", "Expense", "2,432.11"));
            eStats.add(EachExpense("", "Balance", "3,799.12"));

            return eStats;
        }

    }
}
