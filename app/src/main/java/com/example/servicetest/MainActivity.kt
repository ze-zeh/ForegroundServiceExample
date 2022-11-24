package com.example.servicetest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.servicetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, ForegroundService::class.java)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartService.setOnClickListener {
            startService(Intent(this, HelloService::class.java))
        }

        binding.btnStartForegroundService.setOnClickListener {
            startForegroundService(intent)
        }

        binding.btnStopService.setOnClickListener {
            stopService(intent)
        }
    }
}
