package com.example.sbercartui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HistorySection(modifier: Modifier = Modifier){
    Box(modifier = modifier){
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(
                    horizontal = 22.dp,
                    vertical = 10.dp
                ),
            elevation = CardDefaults.cardElevation(6.dp),
            shape = RoundedCornerShape(15.dp)
        ) {
            HistoryContent(
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
fun HistoryContent(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .background(
                color = Color(4, 155,5)
            )
            .padding(2.dp),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "История операций",
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}