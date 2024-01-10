package com.dioageng.tugasbesar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.dioageng.tugasbesar.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import de.hdodenhof.circleimageview.CircleImageView

class MainHome : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private val threshold: Long = 700

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

        setContentView(R.layout.main_home)

        // To go to Profile
        val goToProfile = findViewById<CircleImageView>(R.id.home_profile)
        goToProfile.setOnClickListener{
            val Intent = Intent(this, MainProfile::class.java)
            startActivity(Intent)
        }

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager_2)

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2){tab,position->
            when (position){
                0->{
                    tab.text = "Home"
                }
                1->{
                    tab.text = "Others"
                }
            }
        }.attach()
    }

    override fun onBackPressed() {
        if (backPressedTime + threshold > System.currentTimeMillis()) {
            // Exit the app when the back button is pressed twice within the threshold
            finishAffinity()
        } else {
            // Inform the user to press the back button again to exit
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
            backPressedTime = System.currentTimeMillis()
        }
    }
}