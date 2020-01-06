package com.example.xdapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainPageAdpter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager){
    private val fragments:ArrayList<Fragment>by lazy {
        ArrayList<Fragment>()
    }
    fun addFragment(fragment: Fragment){
        fragments.add(fragment)

    }
    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return  fragments.size
    }
}