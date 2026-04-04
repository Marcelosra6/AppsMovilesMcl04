package com.mchi.actividad

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mchi.actividad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAutocomplete.setOnClickListener {
            val intent = Intent(this, Autocomplete::class.java)
            startActivity(intent)
        }
        binding.btnTimepicker.setOnClickListener {
            val intent = Intent(this, Timepicker::class.java)
            startActivity(intent)
        }
        binding.btnDatepicker.setOnClickListener {
            val intent = Intent(this, Datepicker::class.java)
            startActivity(intent)
        }
    }
}