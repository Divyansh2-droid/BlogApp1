package com.example.blogapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blogapp.ui.screens.BlogDetailScreen
import com.example.blogapp.ui.screens.BlogListScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController: NavHostController = rememberNavController()

            NavHost(navController, startDestination = "list") {
                composable("list") { BlogListScreen(navController) }
                composable("detail/{blogUrl}") { backStackEntry ->
                    val blogUrl = backStackEntry.arguments?.getString("blogUrl") ?: ""
                    BlogDetailScreen(navController, blogUrl)
                }
            }
        }
    }
}
