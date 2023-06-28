package com.jisha.graph.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jisha.graph.R
import com.jisha.graph.databinding.ActivityBarChartBinding
import com.jisha.graph.databinding.ActivityMainBinding

class BarChartActivity : AppCompatActivity() {

    private var binding: ActivityBarChartBinding? = null
    private val _binding get() = binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarChartBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        handleEvents()
    }

    private fun handleEvents(){
        binding?.apply {
            barChartVer.animation.duration = animationDuration
            barChartVer.animate(barSet)

            barChartHor.animation.duration = animationDuration
            barChartHor.animate(barSetHorz)
        }
    }

    companion object{
        private val barSet = listOf(
            "JAN" to 4f,
            "FEB" to 7f,
            "MAR" to 5.2f,
            "APR" to 1f,
            "MAY" to 5f,
            "JUN" to 4f,
        )
        private val barSetHorz = listOf(
            "PORRO" to 4f,
            "FUSCE" to 6f,
            "EGET" to 2.5f,
        )

        private const val animationDuration = 1000L
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}