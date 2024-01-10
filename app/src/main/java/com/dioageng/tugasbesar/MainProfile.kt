package com.dioageng.tugasbesar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainProfile : AppCompatActivity() {
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

        setContentView(R.layout.main_profile)

        val goToHome = findViewById<ImageView>(R.id.profile_toHome)
        goToHome.setOnClickListener{
            val Intent = Intent(this, MainHome::class.java)
            startActivity(Intent)
        }

        val gotoaccount = findViewById<CardView>(R.id.profile_account)
        gotoaccount.setOnClickListener{
            val Intent = Intent(this, ProfileAccount::class.java)
            startActivity(Intent)
        }

        val gotosecurity = findViewById<CardView>(R.id.profile_secutiry)
        gotosecurity.setOnClickListener{
            val Intent = Intent(this, ProfileSecurity::class.java)
            startActivity(Intent)
        }

        val gotogeograph = findViewById<CardView>(R.id.profile_geograph)
        gotogeograph.setOnClickListener{
            val Intent = Intent(this, ProfileGeograph::class.java)
            startActivity(Intent)
        }

        val gotopayment = findViewById<CardView>(R.id.profile_payment)
        gotopayment.setOnClickListener{
            val Intent = Intent(this, ProfilePayment::class.java)
            startActivity(Intent)
        }

        val gotoaccessibility = findViewById<CardView>(R.id.profile_accessibility)
        gotoaccessibility.setOnClickListener{
            val Intent = Intent(this, ProfileAccessibility::class.java)
            startActivity(Intent)
        }

        val gotosettings = findViewById<CardView>(R.id.profile_settings)
        gotosettings.setOnClickListener{
            val Intent = Intent(this, ProfileSettings::class.java)
            startActivity(Intent)
        }

        val goToAbout = findViewById<CardView>(R.id.profile_toAbout)
        goToAbout.setOnClickListener{
            val Intent = Intent(this, ProfileAbout::class.java)
            startActivity(Intent)
        }

        val show : CardView = findViewById(R.id.profile_ratingbar)

        show.setOnClickListener{
            val view : View = layoutInflater.inflate(R.layout.item_rating_bar, null)
            val diaolg = BottomSheetDialog(this)
            diaolg.setContentView(view)
            diaolg.show()
        }
    }

    override fun onBackPressed() {
        // Start the desired activity when the back button is pressed
        val intent = Intent(this, MainHome::class.java)
        startActivity(intent)
    }
}