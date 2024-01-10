package com.dioageng.tugasbesar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import androidx.cardview.widget.CardView

class NotImplemented : AppCompatActivity() {

    private val splashTimeOut: Long = 3000

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

        setContentView(R.layout.not_implemented_yet)

        Handler().postDelayed({
            // Start the SignUpActivity after the delay
            val intent = Intent(this, MainHome::class.java)
            startActivity(intent)
            finish() // Close the splash screen (MainActivity)
        }, splashTimeOut)

        // Find your CardView by its ID
        val cardView = findViewById<CardView>(R.id.not_spawnCard)

        // Hide the CardView initially
        cardView.visibility = View.GONE

        // Schedule a task to make the CardView visible after 4 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            cardView.visibility = View.VISIBLE
        }, 2500) // delay
    }

    override fun onBackPressed() {
    }
}