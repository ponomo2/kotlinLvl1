package com.example.hw2.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

const val WELCOME = "welcome"
const val USER = "user"
const val ROOT = "root"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Settings: Screen(route = "settings_screen")
    object Payments: Screen(route = "payments_screen")
    object Plans: Screen(route = "plans_screen")
}
//
//@Composable
//fun Menu(onClick: () -> Unit){
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Button(onClick = {
//            onClick()
//        }) {
//            Text(text = "Уроки")
//        }
//    }
//}
//
//@Composable
//fun LessonsList(onClick: () -> Unit) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Button(onClick = {
//            onClick()
//        }) {
//            Text(text = "Назад")
//        }
//    }
//}
//
//
//@Composable
//fun Lesson(onClick: () -> Unit) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Button(onClick = {
//            onClick()
//        }) {
//            Text(text = "К списку")
//        }
//    }
//}