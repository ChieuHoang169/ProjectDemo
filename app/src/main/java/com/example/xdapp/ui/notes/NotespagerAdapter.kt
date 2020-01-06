package com.example.xdapp.ui.notes

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class NotespagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm)
{

    override fun getItem(position: Int): Fragment {
        return  when(position){
           0 ->{
               IdeaFragment()
           }
            1->{
                ScrapFragment()
            }
            2->{
                StudyFragment()
            }
            3->{
                ThoughtsFragment()
            }
            4->{
                To_dilistFragment()
            }
            else->{
                return IdeaFragment()
            }

        }
    }



    override fun getPageTitle(position: Int): CharSequence {
        return when(position){
            0->"Ideal"
            1->"Scrap"
            2 ->"Study"
            3 ->"Thought"
            4 ->"To-do list"
            else ->{
                return "To_do list"
            }
        }
}

    override fun getCount(): Int {
        return 5
    }
}