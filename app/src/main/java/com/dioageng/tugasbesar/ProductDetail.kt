package com.dioageng.tugasbesar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.ncorti.slidetoact.SlideToActView

class ProductDetail : AppCompatActivity() {
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

        setContentView(R.layout.product_detail)

        val gotohome = findViewById<ImageView>(R.id.product_toHome)
        gotohome.setOnClickListener{
            val Intent = Intent(this, MainHome::class.java)
            startActivity(Intent)
        }

        val slideToActView: SlideToActView = findViewById(R.id.GoTo_NotImplemented)

        slideToActView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                // Start the new activity here
                val intent = Intent(this@ProductDetail, NotImplemented::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onBackPressed() {
        // Start the desired activity when the back button is pressed
        val intent = Intent(this, MainHome::class.java)
        startActivity(intent)
    }
}