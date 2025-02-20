package com.example.blogapp.ui.screens

import android.annotation.SuppressLint
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import java.net.URLDecoder
import java.nio.charset.StandardCharsets

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun BlogDetailScreen(navController: NavController, blogUrl: String) {
    val decodedUrl = URLDecoder.decode(blogUrl, StandardCharsets.UTF_8.toString())

    WebViewWrapper(decodedUrl)

    // Handle back button press
    BackHandler {
        navController.popBackStack()
    }
}

@Composable
fun WebViewWrapper(url: String) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                webViewClient = WebViewClient()
                settings.javaScriptEnabled = true
                loadUrl(url)
            }
        }
    )
}
