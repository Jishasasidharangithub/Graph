package com.jisha.graph.ui.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jisha.graph.databinding.ActivityLineChartBinding

class LineChartActivity : AppCompatActivity() {

    private var binding: ActivityLineChartBinding? = null
    private val _binding get() = binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLineChartBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        handleEvents()
    }

    private fun handleEvents(){
        binding?.apply {
            lineChart.gradientFillColors = intArrayOf(
               Color.parseColor("#FF3700B3"),
               Color.TRANSPARENT
            )
            lineChart.animation.duration = animationDuration
            lineChart.animate(lineSet)
            lineChart.onDataPointClickListener={ index, _, _ ->
                tvChartData.text = lineSet.toList()[index].second.toString()
            }

        }
    }

    companion object{
        private val lineSet = listOf(
            "label1" to 4.5f,
            "label2" to 6f,
            "label3" to 10f,
            "label4" to 3f,
            "label5" to 2.5f,
            "label6" to 5.5f,
        )
        private const val animationDuration = 1000L
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}