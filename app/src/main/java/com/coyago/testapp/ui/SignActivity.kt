package com.coyago.testapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coyago.testapp.R
import com.coyago.testapp.logic.login.Sign

class SignActivity : AppCompatActivity() {


    // este debe corresponder al nombre del a clase, se va cearse lueg, no se cuando pero se crea, es nula

    private val singIn: Sign = Sign()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)





    }






}