package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PageFragment1()
            1 -> PageFragment2()
            2 -> PageFragment3()
            else -> throw java.lang.IllegalStateException(Constants.INVALID_POSITION)
        }
    }
}