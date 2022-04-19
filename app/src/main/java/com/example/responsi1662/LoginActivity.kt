package com.example.responsi1662

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.btn1

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnback1Listener()
        btnback2Listener()
        txtLoginListener()
    }

    private fun btnback1Listener() {
        satu.setOnClickListener {
            startActivity(Intent(this, RecoveryActivity::class.java))
        }
    }

    private fun btnback2Listener() {
        dua.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun txtLoginListener() {
        btn1.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}