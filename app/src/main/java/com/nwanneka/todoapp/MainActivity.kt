package com.nwanneka.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val validUsername: String = "admin"
    val validpassword: String = "admin"

    private lateinit var usernameinput: EditText
    private lateinit var passwordinput: EditText
    private lateinit var submitButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameinput =findViewById(R.id.usernameinput)
        passwordinput =findViewById(R.id.Passwordinput)
        submitButton=findViewById(R.id.button)

        submitButton.setOnClickListener{
            val username = usernameinput.text.toString()
            val password = passwordinput.text.toString()

            login(username, password)
        }

    }

    private fun login(username: String, password: String) {
        if (isvalidCredentials(username, password)) {
            val intent: Intent= Intent(this, HomeActivity::class.java )
            intent.putExtra("username", username)
            startActivity(intent)
        } else {
            Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
        }

    }
    private fun isvalidCredentials(username: String, password: String): Boolean {
        if (username == validUsername && password == validpassword) return true
        return false
    }
}