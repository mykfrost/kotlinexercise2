package com.chinatown254.exercisetwo
import androidx.navigation.NavController
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.node.modifierElementOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import com.chinatown254.exercisetwo.ui.theme.ExerciseTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExerciseTwoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {

                    }
                   // Greeting("Android")
                    BackGroundImage(stringResource(R.string.title) ,
                    stringResource(R.string.heading) , stringResource(R.string.body))
                }
            }
        }
    }


@Composable
fun BackGroundImage(title: String, heading: String , body: String, modifier: Modifier = Modifier){
    val image  = painterResource(R.drawable.bg_compose_background)
    Box() {
        Image(painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop ,
            alpha = 0.5F ,
            modifier = modifier
            )
        Texts(title = title, heading = heading, body = body)
    }
}

@Composable
fun Texts(title : String , heading : String , body : String , modifier: Modifier = Modifier){
    Column( verticalArrangement = Arrangement.Center ,
     modifier = modifier){
        Text(
            text = title,
            fontFamily = FontFamily.Serif,
            fontSize = 24.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center ,
            modifier = modifier
                .padding(16.dp)

        )

        Text(
            text = heading,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify ,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)

        )
        Text(
            text = body,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify ,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExerciseTwoTheme {
        BackGroundImage(stringResource(R.string.title),
            stringResource(R.string.heading) , stringResource(R.string.body ) )
    }
}