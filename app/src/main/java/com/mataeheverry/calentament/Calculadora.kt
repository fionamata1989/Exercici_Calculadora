package com.mataeheverry.calentament

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mataeheverry.calentament.ui.theme.CalentamentTheme

class Calculadora : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalentamentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PreviewCalculadora()

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun vistaCalculadora(onClick: Boolean) {

    Column(verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0XFF006a63)))
    {
        var text = "1.10"
        TextField(
            value = text,
            onValueChange = { text = it },
            textStyle = TextStyle(
                fontSize = 24.sp,
                textAlign = TextAlign.Right),
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .padding(top = 50.dp)
                .background(Color(0xFFffffff)))
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp)){

            //Columna botons números:
            Column(verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                .fillMaxHeight()
                .weight(0.75f))
            {
                //Aquí fer rows amb botons
                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                        .weight(1f))
                {
                    Button(onClick = { /*TODO*/ },

                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                   {
                       Text(text = "1",
                           fontSize = 24.sp,
                           color = Color(0XFF191c1c))

                   }
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                    {
                        Text(text = "2",
                            fontSize = 24.sp,
                            color = Color(0XFF191c1c))

                    }
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                    {
                        Text(text = "3",
                            fontSize = 24.sp,
                            color = Color(0XFF191c1c))
                    }
                }
                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                        .weight(1f))
                {
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                    {
                        Text(text = "4",
                            fontSize = 24.sp,
                            color = Color(0XFF191c1c))

                    }
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                    {
                        Text(text = "5",
                            fontSize = 24.sp,
                            color = Color(0XFF191c1c))

                    }
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                    {
                        Text(text = "6",
                            fontSize = 24.sp,
                            color = Color(0XFF191c1c))
                    }
                }
                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                        .weight(1f))
                {
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                    {
                        Text(text = "7",
                            fontSize = 24.sp,
                            color = Color(0XFF191c1c))
                    }
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                    {
                        Text(text = "8",
                            fontSize = 24.sp,
                            color = Color(0XFF191c1c))
                    }
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                    {
                        Text(text = "9",
                            fontSize = 24.sp,
                            color = Color(0XFF191c1c))
                    }
                }

                Row(horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(20.dp)
                )
                {
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                        modifier = Modifier
                            .fillMaxSize()
                        )
                    {
                        Text(
                            text = "0",
                            fontSize = 24.sp,
                            color = Color(0XFF191c1c)
                        )
                    }
                }
            }

            Column(verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.3f)
                    .padding(top = 5.dp, bottom=20.dp)
            )

            {
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                    modifier = Modifier
                        .weight(0.33f)
                        .fillMaxHeight()
                        .padding(bottom=20.dp)
                )
                {
                    Text(text = "C",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c))

                }
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                    modifier = Modifier
                        .weight(0.33f)
                        .fillMaxHeight()
                        .padding(bottom=20.dp)
                )
                {
                    Text(text = "+",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c))

                }
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFcce8e4)),
                    modifier = Modifier
                        .weight(0.33f)
                        .fillMaxHeight()
                )
                {
                    Text(text = "=",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c))
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCalculadora() {

    vistaCalculadora(true)

}

