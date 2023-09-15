package com.example.datecalculations.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.datecalculations.R
import com.example.datecalculations.model.DateHandler

@Composable
fun DateCalculationUI() {

    var datePickerVisible by remember {
        mutableStateOf(false)
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {

        if (datePickerVisible) {
            DatePickerScreen()
            Button(onClick = {
                datePickerVisible = false
            }) {
                Text(text = stringResource(id = R.string.set_date_text))
            }
        } else {
            Button(onClick = {
                datePickerVisible = true
            }) {
                Text(text = stringResource(id = R.string.open_date_picker_text))
            }
        }

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

