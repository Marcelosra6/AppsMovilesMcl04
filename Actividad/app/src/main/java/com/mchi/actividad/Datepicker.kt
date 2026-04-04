package com.mchi.actividad

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import com.mchi.actividad.databinding.ActivityDatepickerBinding

class Datepicker : AppCompatActivity() {
    private lateinit var binding: ActivityDatepickerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDatepickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val datepicker: DatePicker = binding.datePicker
        binding.btnRetroceder.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    public fun onClick(view : View){
        val fecha = "${binding.datePicker.dayOfMonth}/${binding.datePicker.month + 1}/${binding.datePicker.year}"
        Toast.makeText(baseContext, "Fecha seleccionada" + fecha,
            Toast.LENGTH_SHORT).show()
    }
}