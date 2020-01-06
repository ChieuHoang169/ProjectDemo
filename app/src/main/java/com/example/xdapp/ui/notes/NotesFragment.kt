package com.example.xdapp.ui.notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.example.xdapp.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_notes.*


class NotesFragment : Fragment() {

    private lateinit var notesViewModel: NotesViewModel
    private lateinit var viewPager:ViewPager
    private lateinit var tableLayout :TabLayout



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
            notesViewModel = ViewModelProviders.of(this).get(NotesViewModel::class.java)
         val root = inflater.inflate(com.example.xdapp.R.layout.fragment_notes, container, false)
        viewPager = root.findViewById(R.id.pager)
        tableLayout = root.findViewById(R.id.tab)


        val notespagerAdapter = NotespagerAdapter(childFragmentManager)
        viewPager.adapter =notespagerAdapter

        tableLayout.setupWithViewPager(viewPager)

        return root

    }



}
