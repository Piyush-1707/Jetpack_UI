package com.example.jetpack_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_ui.ui.theme.Jetpack_UITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            var text by remember {
                mutableStateOf("")
            }
            var password by remember {
                mutableStateOf("")
            }
            Jetpack_UITheme {
                Column {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surface
                        ),
                        elevation = CardDefaults.cardElevation(8.dp),
                        modifier = Modifier
                            .size(width = 1000.dp, height = 550.dp)
                            .padding(30.dp),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "Jetpack Compose",
                                color = colorResource(id = R.color.someblue),
                                fontSize = 30.sp
                            )
                            Image(
                                painter = painterResource(id = R.drawable.jetpack_logo),
                                contentDescription = "Jetpack compose image",
                                modifier = Modifier.size(120.dp)
                            )

                            Text(
                                text = "Login", color = colorResource(id = R.color.teal_700),
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .padding(start = 5.dp), fontSize = 30.sp
                            )
                            OutlinedTextField(
                                value = text,
                                onValueChange = { text = it },
                                label = { Text("Email ID or Mobile Number") },
                                modifier = Modifier.fillMaxWidth()
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            OutlinedTextField(
                                value = password,
                                onValueChange = { password = it },
                                label = { Text("Password") },
                                modifier = Modifier.fillMaxWidth()
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                "Forgot Password?",
                                color = colorResource(id = R.color.teal_700),
                                modifier = Modifier.align(Alignment.End)
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start
                            ) {
                                Button(onClick = { println("Button clicked") }) {
                                    Text(text = "Login")
                                }
                            }

                        }

                    }
                    Row(
                        modifier = Modifier.padding(start = 95.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text("Don't have an account? ", color = Color.Black)
                        Text("Register", color = Color.Blue)
                    }
                }
            }
        }
    }
}
