@file:OptIn(ExperimentalAnimationApi::class)

package com.qamar.composablewidgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qamar.composablewidgets.ui.map.ComposeMap
import com.qamar.composablewidgets.ui.ratingbar.RatingBar
import com.qamar.composablewidgets.ui.theme.ComposableWidgetsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableWidgetsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.white)
                ) {

                    ComposeMap()

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposableWidgetsTheme {
        RatingBar(
            rating = 3f, gab = 3.dp,
            starDrawable = R.drawable.star,
            starFillDrawable = R.drawable.startfill
        )
    }
}