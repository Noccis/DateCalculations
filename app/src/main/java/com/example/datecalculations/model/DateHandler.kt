package com.example.datecalculations.model

object DateHandler {
    val listOfDates = mutableListOf<String>()

    init {
        addDateToList("test")
    }

    fun addDateToList(date: String){
        listOfDates.add(date)
    }
}