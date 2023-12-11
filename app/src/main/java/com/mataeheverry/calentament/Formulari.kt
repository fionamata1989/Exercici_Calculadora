package com.mataeheverry.calentament

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mataeheverry.calentament.ui.theme.CalentamentTheme

class Formulari : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalentamentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FormulariAndroid()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun FormulariAndroid() {

    Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFF064273))
            .padding(10.dp)
    ){
        var text = "Nom(*)"
        TextField(value = text,
            onValueChange = { text= it },
            textStyle = TextStyle(
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                color = Color.Gray,
                ),
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(10.dp)
        )
        text = "Cognom(*)"
        TextField(value = text,
            onValueChange = { text= it },
            textStyle = TextStyle(
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                color = Color.Gray,
                ),
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(10.dp)

        )
        text = "Correu electrònic(*)"
        TextField(value = text,
            onValueChange = { text= it },
            textStyle = TextStyle(
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                color = Color.Gray
            ),

            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(10.dp)
        )
        text = "Missatge (*)"
        TextField(value = text,
            onValueChange = { text= it },
            textStyle = TextStyle(
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                color = Color.Gray),
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(10.dp)
        )
        Row(horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(48.dp)
                .weight(0.5f)
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            //verticalAlignment = Alignment.CenterVertically,
            )
        {
            Checkbox(checked = true,
                onCheckedChange = null,
                enabled = true,
                colors = CheckboxDefaults.colors()
                )
            Spacer(Modifier.padding(horizontal = 10.dp))
            Text("Subscriu-me per correu.",
                color = Color(0XFFdef3f6),
                fontSize = 20.sp
            )
        }
        text = "Url del servidor (*)"
        TextField(value = text,
            onValueChange = { text= it },
            textStyle = TextStyle(
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                color = Color.Gray),
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(10.dp)
        )
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
        {
            ElevatedButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1F)
                    .padding(horizontal = 5.dp),
                enabled = true,
                shape = ButtonDefaults.elevatedShape,
                elevation = ButtonDefaults.elevatedButtonElevation(),
                )
            {
                Text(
                    text = "Confirma", fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0XFF064273),
                    modifier = Modifier
                        .focusable(true)
                )
            }
            ElevatedButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1F)
                    .padding(horizontal = 5.dp),
                enabled = true,
                shape = ButtonDefaults.elevatedShape,
                elevation = ButtonDefaults.elevatedButtonElevation(),
                )
            {
                Text(
                    text = "Esborra", fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0XFF064273),
                    modifier = Modifier
                        .focusable(true)
                )
            }
        }

    }

}
