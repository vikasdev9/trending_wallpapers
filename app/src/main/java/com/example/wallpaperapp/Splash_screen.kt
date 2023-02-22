package com.example.wallpaperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.ImageView

class Splash_screen : AppCompatActivity() {
    private lateinit var wall:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_splash_screen)
        this.supportActionBar?.hide()
    wall=findViewById(R.id.wall)
        wall.alpha=0f
        wall.animate().setDuration(3000).alpha(1f).withEndAction{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}
