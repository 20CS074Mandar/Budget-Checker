package com.example.gdscapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    private lateinit var splashLogo:ImageView
    private lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        splashLogo=findViewById(R.id.logo)
//        val animation=AnimationUtils.loadAnimation(this,R.anim.alpha)
//        splashLogo.startAnimation(animation)

        supportActionBar?.hide();
        handler= Handler()
        handler.postDelayed ({

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }


}