package jp.techacademy.yutaro.aisatsuapp

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button1 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (2 <= hour && hour <= 9) {
                    textView.text = "おはよう"
                } else if (10 <= hour && hour <= 17) {
                    textView.text = "こんにちは"
                } else {
                    textView.text = "こんばんは"
                }
            },
            13, 0, true)

        timePickerDialog.show()

    }



}