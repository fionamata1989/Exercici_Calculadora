package com.mataeheverry.calentament

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mataeheverry.calentament.ui.theme.CalentamentTheme

class TextDosColumnesAmbNavegador : ComponentActivity() {
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
@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun ColumnaArticlesAmbNavegador() {

    Column(
        modifier = Modifier
            .background(Color(0XFFfffbff))
            .fillMaxSize()
            .clip(RoundedCornerShape(25.dp)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .background(Color(0XFF963792))
                .fillMaxWidth()
                .padding(15.dp)
        )
        {
            Text(
                "Dues columnes",
                fontSize = 30.sp,
                color = Color(0XFFffffff)
            )
        }

        Row (horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color(0XFFFFFFFF))
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(top = 5.dp))
        {
            ElevatedButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0XFF6d5869)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp),
                enabled = true,
                shape = ButtonDefaults.elevatedShape,
                elevation = ButtonDefaults.elevatedButtonElevation(),
            )
            {
                Text(
                    text = "Article 1",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0XFFffffff),
                    modifier = Modifier
                        .focusable(true),
                )
            }
            ElevatedButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(horizontal = 5.dp),
                colors = ButtonDefaults.buttonColors(Color(0XFF6d5869)),
                enabled = true,
                shape = ButtonDefaults.elevatedShape,
                elevation = ButtonDefaults.elevatedButtonElevation(),
            )
            {
                Text(
                    text = "Article 2", fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0XFFffffff),
                    modifier = Modifier
                        .focusable(true)
                )
            }
            ElevatedButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(horizontal = 5.dp),
                colors = ButtonDefaults.buttonColors(Color(0XFF6d5869)),
                enabled = true,
                shape = ButtonDefaults.elevatedShape,
                elevation = ButtonDefaults.elevatedButtonElevation(),
            )
            {
                Text(
                    text = "Article 3", fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0XFFffffff),
                    modifier = Modifier
                        .focusable(true)
                )
            }
            ElevatedButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(horizontal = 5.dp),
                enabled = true,
                shape = ButtonDefaults.elevatedShape,
                elevation = ButtonDefaults.elevatedButtonElevation(),
            )
            {
                Text(
                    text = "Article 4", fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0XFFffffff),
                    modifier = Modifier
                        .focusable(true)
                )
            }
            ElevatedButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(horizontal = 5.dp),
                colors = ButtonDefaults.buttonColors(Color(0XFF6d5869)),
                enabled = true,
                shape = ButtonDefaults.elevatedShape,
                elevation = ButtonDefaults.elevatedButtonElevation(),
            )
            {
                Text(
                    text = "Article 5", fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0XFFffffff),
                    modifier = Modifier
                        .focusable(true)
                )
            }
        }
        //Contenedor d'Articles
        Row(
            modifier = Modifier
                .background(Color(0XFFFFFFFF))
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            //region Primera Columna
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color(0XFFffd7f5))
                    .fillMaxSize()
                    .weight(1F)
                    .padding(5.dp)
            ) {
                Text(
                    "Article 1",
                    fontSize = 20.sp,
                    color = Color(0XFF380038),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .align(Alignment.Start))
                Text(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                    fontSize = 15.sp,
                    color = Color(0XFF380038),
                    style = MaterialTheme.typography.displayMedium,
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp,
                    modifier = Modifier
                        .weight(1F)
                        .padding(bottom = 5.dp))
                Text(
                    "Article 2",
                    fontSize = 20.sp,
                    color = Color(0XFF380038),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .align(Alignment.Start))
                Text(
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                    fontSize = 15.sp,
                    color = Color(0XFF380038),
                    style = MaterialTheme.typography.displayMedium,
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp,
                    modifier = Modifier
                        .weight(1F)
                        .padding(bottom = 5.dp)
                )
                Text(
                    "Article 3",
                    fontSize = 20.sp,
                    color = Color(0XFF380038),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .align(Alignment.Start))
                Text(
                    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                    fontSize = 15.sp,
                    color = Color(0XFF380038),
                    style = MaterialTheme.typography.displayMedium,
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp,
                    modifier = Modifier
                        .weight(1F)
                        .padding(bottom = 5.dp))
            }
            //endregion
            Spacer(Modifier.padding(5.dp))

            //region Segona Columna
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .background(Color(0XFFffd7f5))
                    .fillMaxSize()
                    .weight(1F)
                    .padding(5.dp)
            ) {
                Text(
                    "Article 4",
                    fontSize = 20.sp,
                    color = Color(0XFF380038),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .align(Alignment.Start))
                Text(
                    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                    fontSize = 15.sp,
                    color = Color(0XFF380038),
                    style = MaterialTheme.typography.displayMedium,
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp,
                    modifier = Modifier
                        .padding(bottom = 5.dp))
                Text(
                    "Article 5",
                    fontSize = 20.sp,
                    color = Color(0XFF380038),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .align(Alignment.Start))
                Text(
                    "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.",
                    fontSize = 15.sp,
                    color = Color(0XFF380038),
                    style = MaterialTheme.typography.displayMedium,
                    maxLines = 6,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp,
                    modifier = Modifier
                        .padding(bottom = 5.dp))
                Text(
                    "Article 6",
                    fontSize = 20.sp,
                    color = Color(0XFF380038),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .align(Alignment.Start))
                Text(
                    "Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem",
                    fontSize = 15.sp,
                    color = Color(0XFF380038),
                    style = MaterialTheme.typography.displayMedium,
                    textAlign = TextAlign.Center,
                    maxLines = 6,
                    overflow = TextOverflow.Ellipsis,
                    lineHeight = 24.sp,
                    modifier = Modifier

                        .padding(bottom = 5.dp))
            }
               //endregion
        }
    }
}
