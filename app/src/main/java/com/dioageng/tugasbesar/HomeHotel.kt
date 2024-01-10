package com.dioageng.tugasbesar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.LinearLayout

class HomeHotel : AppCompatActivity() {
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

        setContentView(R.layout.home_hotel)

        val goToHome = findViewById<ImageView>(R.id.feature1_back)
        goToHome.setOnClickListener{
            val Intent = Intent(this, MainHome::class.java)
            startActivity(Intent)
        }

        val gotoprduct1 = findViewById<LinearLayout>(R.id.feature1_widget1)
        gotoprduct1.setOnClickListener{
            val Intent = Intent(this, ProductDetail::class.java)
            startActivity(Intent)
        }

        val gotoproduct2 = findViewById<LinearLayout>(R.id.feature1_widget2)
        gotoproduct2.setOnClickListener{
            val Intent = Intent(this, ProductDetail::class.java)
            startActivity(Intent)
        }

        val gotoproduct3 = findViewById<LinearLayout>(R.id.feature1_widget3)
        gotoproduct3.setOnClickListener{
            val Intent = Intent(this, ProductDetail::class.java)
            startActivity(Intent)
        }
    }

    override fun onBackPressed() {
        // Start the desired activity when the back button is pressed
        val intent = Intent(this, MainHome::class.java)
        startActivity(intent)
    }
}