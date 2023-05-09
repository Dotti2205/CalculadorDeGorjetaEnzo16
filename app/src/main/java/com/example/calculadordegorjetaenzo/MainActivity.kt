package com.example.calculadordegorjetaenzo

import android.icu.text.AlphabeticIndex
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadordegorjetaenzo.ui.theme.CalculadorDeGorjetaEnzoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadorDeGorjetaEnzoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  AppCalculadoraDeGorjeta()
                }
            }
        }
    }
}
@Composable
fun AppCalculadoraDeGorjeta(){

    var valorEntrada by remember {mutableStateOf()}

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
  Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Top,
    modifier = Modifier.fillMaxSize()
){

    Text(
        text = "Calculadora De Gorjeta",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(top = 30.dp)
        )
    TextField(
        value = valorEntrada,
        onValueChange = {valorEntrada = it},
        modifier = Modifier
            .padding(top = 40.dp
            )
          )
      Text(
          text ="Valor De Gorjeta ",
          fontSize = 25.dp,
          fontWeight = FontWeight.Bold,
          modifier = Modifier
              .padding(top = 30.dp)
      )
       }
    }
}

