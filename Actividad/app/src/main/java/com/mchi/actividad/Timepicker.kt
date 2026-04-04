package com.mchi.actividad

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.TimePicker
import android.widget.Toast
import com.mchi.actividad.databinding.ActivityTimepickerBinding

class Timepicker : AppCompatActivity() {
    private lateinit var binding: ActivityTimepickerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTimepickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRetroceder.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    fun onClick(view: View){
        val hora = binding.timePicker.hour
        val minuto = binding.timePicker.minute
        Toast.makeText(baseContext,
            "Hora seleccionada: $hora:$minuto",
            Toast.LENGTH_SHORT).show()
    }
}