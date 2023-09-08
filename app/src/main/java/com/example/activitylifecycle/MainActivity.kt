package com.example.activitylifecycle

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
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

const val Tag = "MainActivity"
class MainActivity : ComponentActivity() {
    val create: MutableState<String> = mutableStateOf("")
    val pause: MutableState<String> = mutableStateOf("")
    val resume: MutableState<String> = mutableStateOf("")
    val start: MutableState<String> = mutableStateOf("")
    val stop: MutableState<String> = mutableStateOf("")
    val destroy: MutableState<String> = mutableStateOf("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        create.value = "onCreateCalled"
        Log.d(Tag, "On create called")
        setContent {
            ActivityLifecycleTheme {
                Column() {
//                    Text(text = )
//                    Text(text = )
                    Text(text = create.value)
                    Text(text = start.value)
                    Text(text = resume.value)
                    Text(text = pause.value)
                    Text(text = stop.value)

                }
            }

        }
    }

    override fun onStart() {
        super.onStart()
        start.value = "Onstart Called"
        Log.d(Tag, "On start called")
    }

    override fun onPause() {
        super.onPause()
        pause.value = "onPauseCalled"
        Log.d(Tag, "On pause called")
    }

    override fun onStop() {
        super.onStop()
        stop.value = " On stop called"
        Log.d(Tag, "On stop called")
    }

    override fun onResume() {
        super.onResume()
        resume.value = "onResumeCalled"
        Log.d(Tag, "On resume called")
    }

    override fun onDestroy() {
        super.onDestroy()
        destroy.value = " On destroy called"
        Log.d(Tag, "On Destroy callled")
    }
}

