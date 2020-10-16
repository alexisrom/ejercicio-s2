package com.example.semana2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun next(view: View) {
        //val editText = findViewById<EditText>(R.id.editText)
        //val message = editText.text.toString()
        val name = txtNombre.text.toString()
        val birthday = dpFecha.text.toString()
        val phone = txtPhONE.text.toString()
        val email = txtEmail.text.toString()
        val description = txtDescripcion.text.toString()

        val intent = Intent(this, DetalleActivity::class.java).apply {
            putExtra("name", name)
            putExtra("birthday", birthday)
            putExtra("phone", phone)
            putExtra("email", email)
            putExtra("description", description)
        }
        startActivity(intent)
    }
}