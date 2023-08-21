package com.shoykat.tablayoutandviewpager.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.shoykat.tablayoutandviewpager.Fragment1
import com.shoykat.tablayoutandviewpager.Fragment2

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 2 // Number of fragments
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            else -> Fragment1() // Default to the first fragment
        }
    }
}