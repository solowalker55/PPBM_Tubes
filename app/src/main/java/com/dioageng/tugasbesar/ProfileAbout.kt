package com.dioageng.tugasbesar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView

class ProfileAbout : AppCompatActivity() {
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

        setContentView(R.layout.profile_about)

        val goToProfile = findViewById<ImageView>(R.id.about_toProfile)
        goToProfile.setOnClickListener{
            val Intent = Intent(this, MainProfile::class.java)
            startActivity(Intent)
        }

        val goToFacebook = findViewById<ImageView>(R.id.about_toFacebook)
        goToFacebook.setOnClickListener{
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.facebook.com/solo.walker.900")//URL
            startActivity(openURL)
        }

        val goToInstagram = findViewById<ImageView>(R.id.about_toInstagram)
        goToInstagram.setOnClickListener{
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.instagram.com/agg_stwan/")//URL
            startActivity(openURL)
        }

        val goToWhatsapp = findViewById<ImageView>(R.id.about_toWhatsApp)
        goToWhatsapp.setOnClickListener{
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://wa.me/62895603154970")//URL
            startActivity(openURL)
        }
    }

    override fun onBackPressed() {
        // Start the desired activity when the back button is pressed
        val intent = Intent(this, MainProfile::class.java)
        startActivity(intent)
    }
}