package com.example.practicalistasyclases_001

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practicalistasyclases_001.data.Vehiculos
import com.example.practicalistasyclases_001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val vehiculosAgregados = gestionarVehiculos()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val autos = vehiculosAgregados.joinToString(separator = "\n") {
            "${it.marca}, ${it.subMarca},${it.modelo}"
        }

        binding.tvTexto1.text = autos
    }
}