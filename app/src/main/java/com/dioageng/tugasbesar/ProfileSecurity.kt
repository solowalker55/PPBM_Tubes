package com.dioageng.tugasbesar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView

class ProfileSecurity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                )

        // Hide the status bar
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.profile_security)

        val gotoprofile = findViewById<ImageView>(R.id.psecurity_profile)
        gotoprofile.setOnClickListener{
            val Intent = Intent(this, MainProfile::class.java)
            startActivity(Intent)
        }
    }

    override fun onBackPressed() {
        // Start the desired activity when the back button is pressed
        val intent = Intent(this, MainProfile::class.java)
        startActivity(intent)
    }
}