package com.jisha.graph.ui.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jisha.graph.databinding.ActivityPieChartBinding

class PieChartActivity : AppCompatActivity() {

    private var binding: ActivityPieChartBinding? = null
    private val _binding get() = binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPieChartBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        handleEvents()
    }

    private fun handleEvents(){
        binding?.apply {
            dountChart.donutColors= intArrayOf(
                Color.parseColor("#FF3700B3"),
                Color.parseColor("#FF03DAC5"),
                Color.parseColor("#FF018786")
            )
            dountChart.animation.duration= animationDuration
            dountChart.animate(pieSet)
        }
    }
    companion object{
        private val pieSet= listOf(
            20F,
            80F,
            100F
        )
        private const val animationDuration = 1000L
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}