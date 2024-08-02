package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import com.example.login_signup_front_page_design_project.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.loginbutton)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)

        button.setOnClickListener{
            val user = username.text.toString().trim()
            val pass = password.text.toString().trim()

            if(user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this,"Please enter both username and password",Toast.LENGTH_SHORT).show()
            } else {
                if(user == "admin" && pass == "admin") {
                    Toast.makeText(this,"Login successful",Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this,"Invaild Username or Password",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}