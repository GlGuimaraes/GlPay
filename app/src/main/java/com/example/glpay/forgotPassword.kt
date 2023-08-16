package com.example.glpay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.glpay.databinding.ActivityForgotPasswordBinding
import com.example.glpay.databinding.ActivityMainBinding

class forgotPassword : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.imageBack.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.image_back){
            val voltar = Intent(this, MainActivity::class.java)
            startActivity(voltar)
        }
    }
}