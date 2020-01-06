package com.example.xdapp.ui.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.xdapp.R

class AddFragment : Fragment() {

    private lateinit var addViewModel: AddViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        addViewModel =
                ViewModelProviders.of(this).get(AddViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notes, container, false)
        return root
    }
}

