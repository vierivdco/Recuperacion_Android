package com.cervantes.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cervantes.myapplication.databinding.ActivityShowDatosPersonalesBinding

class ShowDatosPersonalesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowDatosPersonalesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityShowDatosPersonalesBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
    fun showData(view: View){
        val showName: String= binding.edtName.text.toString()
        val showEmail: String = binding.edtEmail.text.toString()

        binding.tvResults.visibility = View.VISIBLE
        binding.tvResults.text = "Email: $showEmail" +
                "Nombre:$showName"


    }
}