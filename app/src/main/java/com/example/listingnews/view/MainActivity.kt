package com.example.listingnews.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listingnews.R
import com.example.listingnews.injection.News
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dataNews: News

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}