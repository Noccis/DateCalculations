package com.example.datecalculations.model

import java.time.LocalDate

object DateHandler {
    val listOfDates = mutableListOf<String>()

    init {
        addDateToList("test")
    }

    fun addDateToList(date: String){
        listOfDates.add(date)
    }
    fun getReminderDates(date: String) {
        val startDate = convertStringToDate(date)
        //   DatesHandler.addDateToList(startDate.toString())
        for (i in 1..7) {
            println(startDate)
        }
    }

    fun convertStringToDate(input: String): LocalDate {
        var date: LocalDate
        if (input.length == 6) {
            val year = input.substring(0, 1)
            val month = input.substring(2, 3)
            val day = input.substring(4, 5)
            date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            println(date)
        } else {
            // Create toast here with wrong input message
            println("INPUT --------" + input)
            date = LocalDate.of(2023, 9, 18)
        }
        return date
    }

    fun addDaysToDate(counter: Int, startDate: LocalDate): String {

        var daysToAdd: Long
        when (counter) {
            // Första påminnelsen
            1 -> daysToAdd = 30
            // Deadline labb
            2 -> daysToAdd = 32
            // Labbar ska vara rättade
            3 -> daysToAdd = 39
            // Påminnelse rester
            4 -> daysToAdd = 44
            // Deadline rester
            5 -> daysToAdd = 46
            // Rester ska vara rättade
            6 -> daysToAdd = 53
            // Diplom ska vara utskickade
            7 -> daysToAdd = 60
            else -> {
                daysToAdd = 0
            }
        }
        var date = LocalDate.of(2023, 9, 18)
        var modifiedDate = date.plusDays(daysToAdd)

        return modifiedDate.toString()
    }
}