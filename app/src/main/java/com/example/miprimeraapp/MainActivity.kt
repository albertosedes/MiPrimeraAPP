package com.example.miprimeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//LLamado cuando el usuario teclea el botón Send
    fun sendMessage(view: View) {
        //Hace algo en respuesta al botón
    val editText = findViewById<EditText>(R.id.editText)
    val message=editText.text.toString()
    val intent = Intent(this, DisplayMessageActivity::class.java).apply {
        putExtra(EXTRA_MESSAGE, message)
    }
    startActivity(intent)
}
}
