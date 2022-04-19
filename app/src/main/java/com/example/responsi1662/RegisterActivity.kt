package com.example.responsi1662

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnbackLoginListener()
        btnregisterListener()

    }
    private fun btnbackLoginListener(){
        imgback.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    private fun btnregisterListener(){
        btn1.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
}
}