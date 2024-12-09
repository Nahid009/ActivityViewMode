package com.nahidd.viewmodelandroidkotlin

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get


class MainActivity : AppCompatActivity() {

    private lateinit var layout: LinearLayout
    private lateinit var activityViewModel: ActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        activityViewModel = ViewModelProvider(this).get(ActivityViewModel::class.java)

        layout = findViewById(R.id.linearLayout)
        activityViewModel.initView(layout)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.homeFrameLayout, HomeFragment(), "HomeFragment").disallowAddToBackStack()
                .commit()
        }


    }


}



