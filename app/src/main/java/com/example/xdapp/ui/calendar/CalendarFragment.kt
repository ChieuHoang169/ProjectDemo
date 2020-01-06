package com.example.xdapp.ui.calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavDestination
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.xdapp.R
import com.example.xdapp.ui.folder.FolderViewModel
import com.example.xdapp.ui.todo.TodoViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


/**
 * A simple [Fragment] subclass.
 */
class CalendarFragment : Fragment() {

    private lateinit var calendarViewModel: CalendarViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        calendarViewModel =
            ViewModelProviders.of(this).get(CalendarViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_calendar, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageButton = view.findViewById<Button>(R.id.buttontile)
        imageButton.setOnClickListener {
           Navigation.findNavController(it).navigate(R.id.pageTileFragment)
        }
    }
//    private fun hideBottomNavigation() {
//        // bottom_navigation is BottomNavigationView
//        with(nav_view) {
//            if (visibility == View.VISIBLE && alpha == 1f) {
//                animate()
//                    .alpha(0f)
//                    .withEndAction { visibility = View.GONE }
//            }
//        }
//    }


}
