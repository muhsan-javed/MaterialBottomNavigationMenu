package com.muhsanapps.materialbottomnavigationmenu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation_view)

        val badge = bottomNavigationView.getOrCreateBadge(R.id.page1)
        badge.isVisible = true
        badge.number = 99

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page1 -> {
                    true
                }
                R.id.page2 -> {
                    true
                }
                R.id.page3 -> {
                    true
                }
                else -> {
                    false
                }
            }
        }

    }
}