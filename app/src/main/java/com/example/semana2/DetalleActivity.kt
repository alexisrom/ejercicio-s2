package com.example.semana2

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class DetalleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)
        setSupportActionBar(findViewById(R.id.toolbar))


        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val phone = intent.getStringExtra("phone")
        val email = intent.getStringExtra("email")
        val birthday = intent.getStringExtra("birthday")

        findViewById<TextView>(R.id.txtName).apply {
            text = name
        }

        findViewById<TextView>(R.id.txtDescription).apply {
            text = description
        }
        findViewById<TextView>(R.id.txtPhone).apply {
            text = phone
        }
        findViewById<TextView>(R.id.txtEmail).apply {
            text = email
        }
        findViewById<TextView>(R.id.txtBirthday).apply {
            text = birthday
        }

    }
}