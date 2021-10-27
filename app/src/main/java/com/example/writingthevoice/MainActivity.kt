package com.example.writingthevoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var animatedName:TextView? = null
    var timer : Timer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        animatedName = findViewById(R.id.nameAnimated)
        animatedName!!.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate))
        timer = Timer()
        timer!!.schedule(object:TimerTask() {
            override fun run() {
                val intent = Intent(this@MainActivity, TalkingActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000)
    }
}