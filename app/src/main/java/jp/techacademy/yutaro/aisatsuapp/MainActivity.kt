package jp.techacademy.yutaro.aisatsuapp

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v. id){
            R.id.button1 -> textView.text = showTimePickerDialog().toString()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (2 <= hour && hour <= 9) {
                    print("おはよう")
                } else if (10 <= hour && hour <= 17) {
                    print("おはよう")
                } else {
                    print("こんばんは")
                }
            },
            13, 0, true)

        timePickerDialog.show()

    }
}
