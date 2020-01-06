package com.example.xdapp.ui.todo

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.TimePicker
import com.example.xdapp.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_folder.view.*
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*


class Fragment2 : Fragment() {

lateinit var dateEdittext : EditText
    lateinit var timeText : TextView
    private var selectedHour = 0
    private var selectedMinute = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dateEdittext =view.findViewById(R.id.date)
        timeText = view.findViewById(R.id.time)

         timeText.setOnClickListener {
             val currentTime = Calendar.getInstance()
             var hour = currentTime.get(Calendar.HOUR_OF_DAY)
             var minute = currentTime.get(Calendar.MINUTE)
             if (timeText.text.isNotEmpty()){
                 hour = this.selectedHour
                 minute = this.selectedMinute
                 
             }
             val listener = TimePickerDialog.OnTimeSetListener{ view: TimePicker?, selectedHour: Int, selectedMinute: Int ->
                 this.selectedHour = selectedHour
                 this.selectedMinute = selectedMinute
                 timeText.text = "$selectedHour:$selectedMinute"

             }
             val timePicker = TimePickerDialog(this.context,listener,hour,minute,true)
             timePicker.show()

         }

        showDatePicker()

    }



    private fun showDatePicker() {
   dateEdittext.setText(SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis()))
        val cal = Calendar.getInstance()
        val dateSetListener=DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
            cal.set(Calendar.YEAR,year)
            cal.set(Calendar.MONTH,monthOfYear)
            cal.set(Calendar.DAY_OF_MONTH,dayOfMonth)

            val myFormat = "dd/MM/yyyy"
            val sdf = SimpleDateFormat(myFormat,Locale.US)
            dateEdittext.setText(sdf.format(cal.time))
        }
        dateEdittext.setOnClickListener {
            Log.d("Clicked","Interview Date Clicked")
            val dialog = DatePickerDialog(context,dateSetListener,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
                )
            dialog.datePicker.maxDate = CalendarHelper.getCurrentDateInMills()
            dialog.show()
        }
    }

    object CalendarHelper {
        fun getCurrentDateTime(): Date{
            return  Calendar.getInstance().time
        }

        fun getCurrentDateInMills():Long{
            return  Calendar.getInstance().timeInMillis
        }
    }


}
