package com.jisha.graph.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jisha.graph.R
import com.jisha.graph.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val _binding get() = binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        handleEvents()
    }

    private fun handleEvents(){
        binding?.apply {
            btnPieChart.setOnClickListener {
                startActivity(Intent(this@MainActivity, PieChartActivity::class.java))
            }
            btnLineChart.setOnClickListener {
                startActivity(Intent(this@MainActivity, LineChartActivity::class.java))
            }
            btnBarChart.setOnClickListener {
                startActivity(Intent(this@MainActivity, BarChartActivity::class.java))
            }
        }
    }
}