package com.example.mytask_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.mytask_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var controller: NavController

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment).navController
    }
}