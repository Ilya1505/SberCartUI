package com.example.sbercartui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sbercartui.ui.theme.SberCartUITheme
import com.example.sbercartui.ui.theme.TopBar

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SberCartUITheme {

                val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
                    state = rememberTopAppBarState()
                )

                Scaffold(
                    modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
                    topBar = {
                        TopBar(
                            modifier = Modifier.fillMaxWidth(),
                            scrollBehavior = scrollBehavior
                        )
                    }
                ) {paddingValues ->  MainScreen(modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                )}
            }
        }
    }
    @Composable
    fun MainScreen(modifier: Modifier = Modifier){
        Column(
            modifier = modifier.verticalScroll(rememberScrollState())
        ){
            Spacer(modifier = Modifier.height(10.dp))

            CardSection(
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(30.dp))

            BalanceSection(modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(10.dp))

            SpendingSection(modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(20.dp))

            TariffSection(modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(12.dp))

            HistorySection(modifier = Modifier.fillMaxWidth())
        }
    }
}