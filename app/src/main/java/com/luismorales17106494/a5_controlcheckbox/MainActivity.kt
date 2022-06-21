package com.luismorales17106494.a5_controlcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luismorales17106494.a5_controlcheckbox.databinding.ActivityMainBinding

/*
        5 - Control CheckBox

     El objetivo de este concepto es seguir practicando lo visto hasta
     ahora para la creación de un proyecto con Android Studio e incorporar
     el control visual CheckBox
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btOperar.setOnClickListener() {

            if (binding.etNumero1.text.isNotBlank() && binding.etNumero2.text.isNotBlank()) {
                when {
                    binding.cbSuma.isChecked -> {
                        binding.tvResultado.text = "${binding.etNumero1.text.toString().toDouble() + binding.etNumero2.text.toString().toDouble()}"
                    }
                    binding.cbResta.isChecked -> {
                        binding.tvResultado.text = "${binding.etNumero1.text.toString().toDouble() - binding.etNumero2.text.toString().toDouble()}"
                    }
                    binding.cbmulti.isChecked -> {
                        binding.tvResultado.text = "${binding.etNumero1.text.toString().toDouble() * binding.etNumero2.text.toString().toDouble()}"
                    }
                    binding.cbDivi.isChecked -> {
                        binding.tvResultado.text = "${binding.etNumero1.text.toString().toDouble() / binding.etNumero2.text.toString().toDouble()}"
                    }

                    else -> {
                        Toast.makeText(this, "Error en la ejecución", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Rellene todos los campos", Toast.LENGTH_SHORT).show()
            }

        }

    }
}