package com.example.sbercartui

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

@Composable
fun CardSection(modifier: Modifier = Modifier) {
    Box(modifier = modifier){
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 40.dp)
//                .height(100.dp)
//                .clip(RoundedCornerShape(20.dp))
//                .background(
//                    brush = Brush.horizontalGradient(
//                        listOf(Color.Green, Color.Yellow)
//                    )
//                )
//        )

        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
                .padding(
                    horizontal = 22.dp,
                    vertical = 10.dp
                ),
            elevation = CardDefaults.cardElevation(6.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            CardContent(
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
fun CardContent(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color(4, 155,5),
                        Color(148, 224,54),
                        Color(183, 235,70),
                        Color(95, 235,63),
                        Color(68, 171,24),
                        Color(46, 125,12),
                    )
                )
            )
    ){
        Icon(
            painter = painterResource(id = R.drawable.sber_logo),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.background,
            modifier = Modifier
                .height(90.dp)
                .width(90.dp)
                .padding(horizontal = 22.dp, vertical = 12.dp)
                .align(Alignment.TopStart)
        )
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(22.dp)
//                .align(Alignment.TopCenter),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ){
//            Spacer(modifier = Modifier.height(8.dp))
//
//            Text(
//                text = "Мой баланс",
//                color = MaterialTheme.colorScheme.onPrimary.copy(0.6f),
//                fontFamily = FontFamily.SansSerif,
//                fontSize = 22.sp
//            )
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//            Text(
//                text = "981.01 ₽",
//                color = MaterialTheme.colorScheme.onPrimary,
//                fontFamily = FontFamily.SansSerif,
//                fontSize = 40.sp
//            )
//        }

        Column(
            modifier = Modifier
            .fillMaxWidth()
            .padding(22.dp)
            .align(Alignment.BottomStart),
//            verticalArrangement =  Arrangement.SpaceBetween
        ) {

            Text(
                text = "* * * * 3466 зарплатная",
                color = MaterialTheme.colorScheme.onPrimary.copy(0.8f),
                fontSize = 16.sp,
                fontFamily = FontFamily.SansSerif,
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Показать данные",
                color = MaterialTheme.colorScheme.onPrimary,
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp
            )

        }

        Image(
            painter = painterResource(id = R.drawable.mir_cart),
            contentDescription = null,
            modifier = Modifier
                .height(70.dp)
                .width(90.dp)
                .padding(8.dp)
                .align(Alignment.BottomEnd)
        )
    }
}