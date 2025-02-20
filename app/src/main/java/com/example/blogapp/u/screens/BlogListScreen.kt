package com.example.blogapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Composable
fun BlogListScreen(navController: NavController) {
    val blogs = listOf(

        "https://blog.vrid.in/2025/02/18/why-nps-vatsalya-may-not-be-the-right-investment-to-build-wealth-for-your-children/",
        "https://blog.vrid.in/2025/02/11/how-to-invest-in-the-us-market-through-indmoney-vested-and-interactive-brokers-which-one-is-the-best/",
        "https://blog.vrid.in/2025/02/04/what-if-there-were-no-loans-or-credit-what-happens-then/",
        "https://blog.vrid.in/2025/01/28/how-can-we-indians-invest-in-the-us-stock-market-a-complete-beginners-guide/",
        "https://blog.vrid.in/2025/01/21/torres-jewellery-scam-are-gold-savings-schemes-offered-by-jewellers-worth-the-risk/",
        "https://blog.vrid.in/2025/01/14/are-5-star-appliances-really-worth-the-cost-a-simple-guide/",
        "https://blog.vrid.in/2025/01/07/is-silver-a-good-investment-in-2025-heres-what-you-should-know-before-investing/",
        "https://blog.vrid.in/2024/12/17/jar-deciml-review-should-you-use-micro-savings-apps-to-save-and-invest/",
        "https://blog.vrid.in/2024/12/10/9-things-to-look-for-when-choosing-a-health-insurance-policy/",
        "https://blog.vrid.in/2024/12/03/health-insurance-101-base-top-up-super-top-up-individual-and-family-floater-plans/"



    ) // Replace with API data

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(blogs) { blogUrl ->
            val encodedUrl = URLEncoder.encode(blogUrl, StandardCharsets.UTF_8.toString())

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable { navController.navigate("detail/$encodedUrl") },
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Text(text = blogUrl, modifier = Modifier.padding(16.dp))
            }
        }
    }
}

