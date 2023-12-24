package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //δημιουργω μια μεταβλητη val που δεν αλλαζει τιμες και ετσι μπορω να χρησιμοποιησω αυτα που εφτιαξα
        //και λεω βρες ενα οποιοδηποτε εμφανησιμο στοιχειο μεσα στην οθονη με το id
        val btnClickMe = findViewById<Button>(R.id.myButton)
        val tvMyTextView = findViewById<TextView>(R.id.myTextView)

        //η μεταβλητη var αλλαζει
        var timesClicked = 0

        //επειτα δημιουργω εναν ακροατη που σε περιπτωση πατησω το κουμπι να κανει ορισμενες λειτουργιες
        btnClickMe.setOnClickListener{
            timesClicked += 1

            //επειδη η μεταβλητη timesClicked ειναι int δεν μπορω να την βαλω μεσα στην αλλη που περιμενει string, οποτε καλω την συναρτηση toString
            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "You added one more!", Toast.LENGTH_SHORT).show()
        }
    }
}