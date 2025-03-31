package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViewPager()
    }

    private fun initializeViewPager() {
        val pager = findViewById<ViewPager2>(R.id.pagerView)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val pagerAdapter = ViewPagerAdapter(this)
        pager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, pager) {tab, position ->
            tab.text = "Page ${position + 1}"
        }.attach()
    }
}