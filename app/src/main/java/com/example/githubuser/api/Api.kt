package com.example.githubuser.api

import android.telecom.Call
import com.example.githubuser.data.model.ReposInformationResponse
import com.example.githubuser.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")

    fun getSearchUsers(
        @Query(value = "q") query: String
    ): retrofit2.Call<UserResponse>

//    @GET("users/ {username}")
//    @Headers("Authorization: token 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")
//    fun getUserDetail(
//        @Path("username") username:String
//    ): Call<ReposDetailResponse>

    @GET("users/{username}/repos")
    @Headers("Authorization: token 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")
    fun getRepos(
        @Path("username") username: String
    ):retrofit2.Call<ReposInformationResponse>
}