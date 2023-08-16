package com.example.glpay

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.glpay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

   private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textCadastreSe.setOnClickListener(this)
        binding.textForgotPassword.setOnClickListener(this)
    }

    override fun onClick(view: View){
        if (view.id == R.id.text_forgotPassword){
            val navegar = Intent(this, forgotPassword::class.java)
            startActivity(navegar)
        }
        if (view.id == R.id.text_CadastreSe){
            val navegar = Intent(this, register::class.java)
            startActivity(navegar)
        }

    }
}