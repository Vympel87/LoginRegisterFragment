package com.example.loginregisterfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginregisterfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            viewPager.adapter = TabAdapter(supportFragmentManager)

            tabLayout.setupWithViewPager(viewPager)
        }
    }
}