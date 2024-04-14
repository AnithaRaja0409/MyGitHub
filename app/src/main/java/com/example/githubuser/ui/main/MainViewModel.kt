package com.example.githubuser.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.githubuser.api.RetrofitClient
import com.example.githubuser.data.model.User
import com.example.githubuser.data.model.UserResponse
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {

    val listusers = MutableLiveData<ArrayList<User>>()

    fun setSearchUsers(query: String){

        RetrofitClient.apiInstance
            .getSearchUsers(query)
            .enqueue(object : Callback<UserResponse> {

                override fun onResponse(
                    call: retrofit2.Call<UserResponse>,
                    response: Response<UserResponse>
                ) {
                    if(response.isSuccessful){
                        listusers.postValue(response.body()?.items)
                    }
                }

                override fun onFailure(call: retrofit2.Call<UserResponse>, t: Throwable) {
                    Log.d("Failure", t.message.toString()) // Keep an eye
                }

            })

    }

    fun getSearchUsers(): LiveData<ArrayList<User>> {
        return listusers
    }
}