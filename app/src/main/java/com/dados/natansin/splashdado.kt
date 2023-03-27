package com.dados.natansin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashdado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashdado)

        Handler().postDelayed({
                              val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }


}