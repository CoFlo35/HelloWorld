package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button).setOnClickListener { v, ->
            (v as Button).text = "${getString(R.string.my_textChange)}"

        }
        //findViewById<TextView>(R.id.textView).setOnClickListener{p -> (p as TextView).text = "${getString(R.string.my_textChange)}"}
    }
}