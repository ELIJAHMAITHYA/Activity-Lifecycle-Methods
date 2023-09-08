package com.example.activitylifecycle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.activitylifecycle.ui.theme.ActivityLifecycleTheme

class MainActivity : ComponentActivity() {
    val create: MutableState<String> = mutableStateOf("")
    val pause: MutableState<String> = mutableStateOf("")
    val resume: MutableState<String> = mutableStateOf("")
    val start: MutableState<String> = mutableStateOf("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        create.value = "onCreateCalled"
        setContent {
            ActivityLifecycleTheme {
                Column() {
//                    Text(text = )
//                    Text(text = )
                    Text(text = create.value)
                    Text(text = start.value)

                    Text(text = pause.value)
                    Text(text = resume.value)
                }
            }

        }
    }

    override fun onStart() {
        super.onStart()
        start.value = "Onstart Called"
    }

    override fun onPause() {
        super.onPause()
        pause.value = "onPauseCalled"
    }

    override fun onResume() {
        super.onResume()
        resume.value = "onResumeCalled"
    }
}

