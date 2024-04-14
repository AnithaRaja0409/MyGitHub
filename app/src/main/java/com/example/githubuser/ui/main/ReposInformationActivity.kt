package com.example.githubuser.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubuser.R
import com.example.githubuser.databinding.ActivityMainBinding
import com.example.githubuser.databinding.ActivityReposInformationBinding

class ReposInformationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReposInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityReposInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}