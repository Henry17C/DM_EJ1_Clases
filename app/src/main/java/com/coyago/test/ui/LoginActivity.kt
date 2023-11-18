package com.coyago.test.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.coyago.test.R
import com.coyago.test.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding ///manejo global de las variables,
    // este debe corresponder al nombre del a clase, se va cearse lueg, no se cuando pero se crea, es nula

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_login) ya no lo necesite
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)// me dice que hay una realcion aqui y que recupere

    }

    override fun onStart() {
        super.onStart()
        initControls()



    }

    override fun onDestroy() { //este estado libera memoria
        super.onDestroy()
    }

    fun initControls(){
        //val textUsuario= findViewById<EditText>(R.id.txt_usuario) ya no lo necesito
        //val btn_login=  findViewById<Button>(R.id.btn_login)//llamada a mi boton que esta en mi actity Login, ya no lo neceito



        binding.btnLogin.setOnClickListener{ // este ya es un objeto y puedo realizar diversas aciones
            var user =  binding.txtUsuario.text.toString()
            var pass =  binding.txtPass.text.toString()

            if(user!="Henry" && pass!="123"){

            Toast.makeText(this,  "Usuario no registrado", Toast.LENGTH_LONG).show() //el this se coloca porque es en este contexto/los contexto son generales o locales
            //parametros(contexto,mensaje,tiempo)
            }else{
                Toast.makeText(this,  "Bienvenido", Toast.LENGTH_LONG).show() //el this se coloca porque es en este contexto/los contexto son generales o locales

            }

            {


        }



    }




}
}