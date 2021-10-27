package com.example.writingthevoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var animatedName:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        animatedName = findViewById(R.id.nameAnimated)
        animatedName!!.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate))

    }
}