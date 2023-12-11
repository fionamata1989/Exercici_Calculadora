package com.mataeheverry.calentament

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mataeheverry.calentament.ui.theme.CalentamentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalentamentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Menu()
                }
            }
        }
    }
}

@Composable
fun Menu() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFF006a63))
            .padding(15.dp),
        contentAlignment = Alignment.Center,
    )
    {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            //Permet espaiat igual entre botons
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .background(Color(0XFFffffff))
                .padding(10.dp)
                .fillMaxWidth()
        )
        {
            ElevatedButton(onClick = { /*TODO*/ })
            {
                Text(
                    text = "Primer\nbotó",
                    textAlign = TextAlign.Center,
                    color = Color(0xFF006a63),
                    modifier = Modifier
                        .padding(10.dp)
                        .focusable(true)
                )
            }
            ElevatedButton(onClick = { /*TODO*/ })
            {
                Text(
                    text = "Segon\nbotó",
                    textAlign = TextAlign.Center,
                    color = Color(0xFF006a63),
                    modifier = Modifier
                        .padding(10.dp)
                        .focusable(true)
                )
            }
            ElevatedButton(onClick = { /*TODO*/ })
            {
                Text(
                    text = "Tercer\nbotó",
                    textAlign = TextAlign.Center,
                    color = Color(0xFF006a63),
                    modifier = Modifier
                        .padding(10.dp)
                        .focusable(true)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

        Menu()

}