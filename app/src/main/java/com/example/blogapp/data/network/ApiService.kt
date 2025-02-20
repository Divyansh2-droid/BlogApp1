package com.example.blogapp.data.network

import com.example.blogapp.data.model.BlogPost
import retrofit2.http.GET

interface ApiService {
    @GET("wp-json/wp/v2/posts?per_page=10&page=1")
    suspend fun getBlogPosts(): List<BlogPost>
}
