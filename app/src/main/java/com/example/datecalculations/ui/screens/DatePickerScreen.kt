package com.example.datecalculations.ui.screens
import androidx.compose.material3.DateRangePicker
import androidx.compose.material3.DateRangePickerState
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import java.time.LocalDateTime
import java.time.ZoneId

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerScreen() {
    val currentDateTime = LocalDateTime.now()

    val datePickerState = remember {
        DateRangePickerState(
            initialSelectedEndDateMillis = null,
            initialDisplayedMonthMillis = null,
            initialSelectedStartDateMillis = currentDateTime.toMillis(),
            initialDisplayMode = DisplayMode.Picker,
            yearRange = (2023..2024)
        )
    }
    
    DateRangePicker(state = datePickerState)

}

fun LocalDateTime.toMillis() = this.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()