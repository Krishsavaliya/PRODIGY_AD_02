package com.example.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.todoapp.ui.theme.TodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val todoViewModel = ViewModelProvider(this)[TodoViewModel::class.java]
        setContent {
            TodoAppTheme {
                Scaffold(
                    topBar = { /* Add Top Bar if needed */ }
                ) { contentPadding ->
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(contentPadding) // Automatically handles padding
                    ) {
                        TodoListPage(todoViewModel)
                    }
                }
            }
        }
    }
}



