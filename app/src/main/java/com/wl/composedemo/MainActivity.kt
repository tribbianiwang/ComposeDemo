package com.wl.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wl.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Greeting(name = "wdl")
            NewStory()
        }
    }


    @Composable
    fun NewStory(){
        Column(modifier = Modifier.padding(16.dp)){
            Image(painter = painterResource(R.drawable.header), contentDescription = null,
                modifier = Modifier.height(180.dp).fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.height(16.dp))

            Text("郑羽君")
            Text("电话:13223077009")
            Text("网站:www.will.org.cn")
        }

    }


    @Preview
    @Composable
    fun PreviewNewStory(){
        NewStory()
    }

    
    
//    @Composable
//    fun Greeting(name:String){
//        Text("hello ${name}")
//    }
//
//    @Preview
//    @Composable
//    fun PreviewGreeting(){
//        Greeting(name = "dc")
//    }
}

