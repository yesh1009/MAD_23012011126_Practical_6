package com.yash.MAD_23012011126_practical_6

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity(), Animation.AnimationListener {

    private lateinit var gunilogo: ImageView
    private lateinit var guniframeanimation: AnimationDrawable
    private lateinit var animegrowspin: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        gunilogo = findViewById(R.id.image_guni)
        gunilogo.setBackgroundResource(R.drawable.uvpce_animation_list)

        guniframeanimation = gunilogo.background as AnimationDrawable

        animegrowspin = AnimationUtils.loadAnimation(this, R.anim.twin_animation)
        animegrowspin.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)

        if (hasFocus) {
            guniframeanimation.start()
            gunilogo.startAnimation(animegrowspin)
        } else {
            guniframeanimation.stop()
        }
    }

    override fun onAnimationEnd(animation: Animation?) {
        val intent = Intent(this, MainActivity::class.java)   // ✅ Correct class
        startActivity(intent)
        finish() // Optional but recommended
    }

    override fun onAnimationRepeat(animation: Animation?) {}

    override fun onAnimationStart(animation: Animation?) {}
}
