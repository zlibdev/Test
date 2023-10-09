package com.adjst.blockcalculator.idn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adjst.blockcalculator.idn.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}