package com.example.xdapp.ui.folder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.xdapp.R

class FolderFragment: Fragment() {

    private lateinit var folderViewModel: FolderViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        folderViewModel =
                ViewModelProviders.of(this).get(FolderViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_folder, container, false)

        return root
    }


}
