package com.example.datecalculations.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.datecalculations.model.DateHandler

@Composable
fun DateCalculationUI() {

    var datePickerVisible = false
    Column {
        if (DateHandler.listOfDates.isNotEmpty()) {

            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = DateHandler.listOfDates[0],
                fontWeight = FontWeight.Bold
            )
            Text(text = DateHandler.listOfDates[0])
        }
    }

}

