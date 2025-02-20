package com.example.blogapp.repository

import com.example.blogapp.data.model.BlogPost
import com.example.blogapp.data.network.RetrofitInstance

class BlogRepository {
    suspend fun getBlogPosts(): List<BlogPost> {
        return RetrofitInstance.api.getBlogPosts()
    }
}
