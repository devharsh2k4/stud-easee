package com.example.studeasee.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studeasee.R
import com.example.studeasee.databinding.ActivityDoneBinding

class DoneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoneBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.imageView17.animate().apply{
            duration = 1500
            rotationBy(360f)
        }.start()

        binding.buttonEndBook.setOnClickListener{
          Intent(this, MainActivity::class.java).also{
                startActivity(it)
            }
        }

    }
}