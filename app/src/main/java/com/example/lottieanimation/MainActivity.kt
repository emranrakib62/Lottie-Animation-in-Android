package com.example.lottieanimation

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val animationView = findViewById<LottieAnimationView>(R.id.animationView)
        val startBtn = findViewById<Button>(R.id.btnStart)
        val stopBtn = findViewById<Button>(R.id.btnStop)

        // On the click of startBtn
        startBtn.setOnClickListener {
            animationView.playAnimation()
        }

        // On the click of stopBtn
        stopBtn.setOnClickListener {
            animationView.pauseAnimation()
        }
    }


    }
