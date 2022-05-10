package com.cervantes.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cervantes.myapplication.databinding.ActivityCalculateAnimalsBinding

class CalculateAnimalsActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCalculateAnimalsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculateAnimalsBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    fun calculateAnimals(view: View) {
        val numberCats: Int = binding.edtCats.text.toString().toInt()
        val numberDogs: Int = binding.edtDogs.text.toString().toInt()

        val numberAnimals = numberCats + numberDogs

        binding.tvResult.visibility = View.VISIBLE
        binding.tvResult.text = "Cantidad de animales : $numberAnimals"
    }

}