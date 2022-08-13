package com.example.animation_practice

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    lateinit var start_button : Button
    lateinit var end_button : Button
    lateinit var play_pause_image : ImageView

    var play_image = R.drawable.play_foreground
    var pause_image = R.drawable.pause_foreground

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_button = findViewById<Button>(R.id.start_button)
        end_button = findViewById<Button>(R.id.end_button)
        play_pause_image = findViewById<ImageView>(R.id.play_pause_image)

        start_button.setOnClickListener {
            play_pause_image.setImageResource(play_image)

            val fadeIn = ObjectAnimator.ofFloat(play_pause_image, "alpha", 0f, 1f)
            fadeIn.duration = 500
            fadeIn.start()

            val fadeOut = ObjectAnimator.ofFloat(play_pause_image, "alpha", 1f, 0f)
            fadeOut.duration = 500
            fadeOut.start()

            // Fade In & Fade Out 연속적으로 실행되도록 수정 필요
        }

        end_button.setOnClickListener {
            play_pause_image.setImageResource(pause_image)

            val fadeIn = ObjectAnimator.ofFloat(play_pause_image, "alpha", 0f, 1f)
            fadeIn.duration = 500
            fadeIn.start()

            val fadeOut = ObjectAnimator.ofFloat(play_pause_image, "alpha", 1f, 0f)
            fadeOut.duration = 500
            fadeOut.start()
        }
    }
}