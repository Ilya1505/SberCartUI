package com.example.sbercartui

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpendingSection(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .padding(8.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterStart)

        ) {
            ElevatedCard(
                modifier = Modifier
                    .width(210.dp)
                    .height(150.dp)
                    .padding(
                        horizontal = 8.dp
                    ),
                elevation = CardDefaults.cardElevation(10.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                SpendItem(modifier = Modifier.fillMaxSize())
            }

            ElevatedCard(
                modifier = Modifier
                    .width(190.dp)
                    .height(150.dp)
                    .padding(
                        horizontal = 8.dp
                    ),
                elevation = CardDefaults.cardElevation(10.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                ReplenishItem(modifier = Modifier.fillMaxSize())
            }
        }
    }

    Box(
        modifier = modifier
            .padding(8.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterStart)

        ) {
            ElevatedCard(
                modifier = Modifier
                    .width(210.dp)
                    .height(70.dp)
                    .padding(
                        horizontal = 8.dp
                    ),
                elevation = CardDefaults.cardElevation(10.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                AboutCardItem(modifier = Modifier.fillMaxSize())
            }

            ElevatedCard(
                modifier = Modifier
                    .width(190.dp)
                    .height(70.dp)
                    .padding(
                        horizontal = 8.dp
                    ),
                elevation = CardDefaults.cardElevation(10.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                SettingsItem(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun SpendItem(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .background(
                color = Color.White
            )
    ){
        Icon(
            painter = painterResource(id = R.drawable.forward),
            contentDescription = null,
            tint = Color(4, 155,5),
            modifier = Modifier
                .size(45.dp)
                .padding(5.dp)
                .align(Alignment.TopStart)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .align(Alignment.BottomStart),
        ){

            Text(
                text = "Оплатить",
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = "или перевести",
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "ЖКХ, QR и другое",
                color = MaterialTheme.colorScheme.onBackground.copy(0.8f),
                fontFamily = FontFamily.SansSerif,
                fontSize = 14.sp
            )
        }
    }
}


@Composable
fun ReplenishItem(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .background(
                color = Color.White
            )
    ){
        Icon(
            painter = painterResource(id = R.drawable.add_circle),
            contentDescription = null,
            tint = Color(4, 155,5),
            modifier = Modifier
                .size(45.dp)
                .padding(5.dp)
                .align(Alignment.TopStart)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .align(Alignment.BottomStart),
        ){

            Text(
                text = "Пополнить",
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "с любых карт",
                color = MaterialTheme.colorScheme.onBackground.copy(0.8f),
                fontFamily = FontFamily.SansSerif,
                fontSize = 14.sp
            )

            Text(
                text = "и счетов",
                color = MaterialTheme.colorScheme.onBackground.copy(0.8f),
                fontFamily = FontFamily.SansSerif,
                fontSize = 14.sp
            )
        }
    }
}


@Composable
fun AboutCardItem(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .background(
                color = Color.White
            )
            .padding(2.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.article),
                contentDescription = null,
                tint = Color(4, 155,5),
                modifier = Modifier
                    .size(45.dp)
                    .padding(10.dp)
            )

            Text(
                text = "О карте",
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}


@Composable
fun SettingsItem(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .background(
                color = Color.White
            )
            .padding(2.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.settings),
                contentDescription = null,
                tint = Color(4, 155,5),
                modifier = Modifier
                    .size(45.dp)
                    .padding(10.dp)
            )

            Text(
                text = "Настройки",
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}