package com.example.unit1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unit1.ui.theme.Unit1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Unit1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFd2e8d4)
                ) {
                    BusinessCardPreview()
                }
            }
        }
    }
}

@Composable
fun Profile(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Box(
            modifier = Modifier
                .background(Color(0xFF073042))
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.size(160.dp)
            )
        }
        Text(
            text = "Nurul Izzah Nurhidayat",
            fontSize = 30.sp,
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF006833),
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun Contact(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(top = 250.dp, bottom = 50.dp)
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(5.dp)
        ){
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF006833)
                )
            Text(
                text ="+62 812 4174 6993",
                modifier = Modifier
                    .padding(start = 14.dp))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(5.dp)
        ){
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(
                text ="@izzahnin",
                modifier = Modifier
                    .padding(start = 14.dp))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(5.dp)
        ){
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(
                text ="cacaizzah2008@gmail.com",
                modifier = Modifier
                    .padding(start = 14.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Unit1Theme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .padding(top = 100.dp)
                .fillMaxWidth()

        ){
            Profile()
            Contact()
        }
    }
}