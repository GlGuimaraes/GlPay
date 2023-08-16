package com.example.glpay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.glpay.databinding.ActivityRegisterBinding

class register : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
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