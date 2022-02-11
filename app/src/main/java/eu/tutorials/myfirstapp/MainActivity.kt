package eu.tutorials.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.Donotclick)
        val myText = findViewById<TextView>(R.id.HelloPulkit)
        var clicked = 0
        btnClickMe.setOnClickListener {
            clicked+=1
            btnClickMe.text="You disobeyed "+ clicked + " times"
            myText.text=clicked.toString()
            Toast.makeText(this,"PLZ, Do not click" , Toast.LENGTH_LONG).show()
        }
    }
}