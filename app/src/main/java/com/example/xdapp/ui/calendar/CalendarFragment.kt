package com.example.xdapp.ui.calendar

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.xdapp.R


class CalendarFragment : Fragment() {

    private lateinit var calendarViewModel: CalendarViewModel
    private lateinit var listener: FragmentChangeListener

    interface FragmentChangeListener {
        fun onHideBottomNavigation()
        fun onShowBottomNavigation()
    }

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

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        try {
            listener = activity as FragmentChangeListener
            listener.onHideBottomNavigation()
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString() + " must implement FragmentChangeListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        try {
            listener.onShowBottomNavigation()
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString() + " must implement FragmentChangeListener")
        }
    }


}
