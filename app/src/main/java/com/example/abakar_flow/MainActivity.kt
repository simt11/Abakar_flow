package com.example.abakar_flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.abakar_flow.databinding.ActivityMainBinding
import com.example.abakar_flow.ui.main.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
            supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.dataContainer, MainFragment())
                .commit()
    }
}