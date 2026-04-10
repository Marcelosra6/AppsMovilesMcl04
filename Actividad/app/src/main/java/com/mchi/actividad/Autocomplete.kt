package com.mchi.actividad

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.mchi.actividad.databinding.ActivityAutocompleteBinding

class Autocomplete : AppCompatActivity() {
    private lateinit var binding: ActivityAutocompleteBinding

    val presidents = arrayOf(
        "José Luis Bustamante",
        "Zenón Noriega",
        "Manuel Odriá",
        "Manuel Prado",
        "Fco Morales Bermúdez",
        "Fernando Belaunde",
        "Chino Fujimori",
        "Valentín Paniagua",
        "Alejandro Choledo",
        "Alan García",
        "Pedro Pablo Kuczynski",
        "Martín Alberto Vizcarra",
        "Peter Castle",
        "Dina Boluarte Zegarra",
        "Jose Pajerin Ore"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAutocompleteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_dropdown_item_1line, presidents)
        val textView =
            findViewById<AutoCompleteTextView>(R.id.txtPresidentes)
        textView.threshold = 3
        textView.setAdapter(adapter)
        binding.btnRetroceder.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

