package com.mataeheverry.calentament

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mataeheverry.calentament.ui.theme.CalentamentTheme

class TriaColors : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalentamentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true,
    showSystemUi = true,
    backgroundColor = 0XFFECDEDD)
@Composable
fun SelectorColors() {

    Column(
        modifier = Modifier
            .background(Color(0xfffffbff))
            .padding(horizontal = 10.dp)
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.7F)
                    .padding(bottom = 5.dp)

            ) {
                var text: String = "Paraula"
                Text(
                    "Paraula", fontSize = 10.sp,
                    color = Color(0XFF410007),
                    modifier = Modifier
                        .align(Alignment.Start)
                )
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    textStyle = LocalTextStyle.current,
                    shape = TextFieldDefaults.outlinedShape,
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0XFFffdad8)
                    )
                )
                Text(
                    "Paraula", fontSize = 10.sp,
                    color = Color(0XFF410007),
                    modifier = Modifier
                        .align(Alignment.Start)
                )
                text = "Traduccio"
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    textStyle = LocalTextStyle.current,
                    shape = TextFieldDefaults.outlinedShape,
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0XFFffdad8)
                    )
                )
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
                    .weight(0.3F)
                    .padding(10.dp)
            ) {
                Button(
                    onClick = { "TODO " },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFF9c4143))
                )
                {
                    Text(
                        "Esborra",
                        fontSize = 12.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0XFFffdad8))
                .padding(10.dp)
        ) {

            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Afegeix - Edita - Esborra",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0XFF410007),
                    modifier = Modifier
                        .focusable(true),

                    )
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFFFFFFF)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "White",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFFFE4E1)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Misty Rose",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFffc0cb)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Pink",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFFF80ED)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Electric Pink",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFF800080)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Purple",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFFA8072)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Salmon",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFFF7373)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Coral",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFAFEEEE)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Pale Turquoise",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFF00CED1)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Dark Turquoise",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFF008080)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Teal",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFF008080)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Teal",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFFC39797)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Rosé",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFF886969)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Milk Chocolate Brown",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFF4E3C3C)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Dark Brown",
                        fontSize = 24.sp,
                        color = Color(0XFF191c1c)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0XFF333333)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp))
                        .padding(top = 10.dp)
                )
                {
                    Text(
                        text = "Dark Grey",
                        fontSize = 24.sp,
                        color = Color(0XFFFFFFFF)
                    )
                }
            }
        }
    }
}
