package com.freelanceror.appmensagegood

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.freelanceror.appmensagegood.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val messages = listOf(
        "Nunca desista dos seus sonhos!",
        "O sucesso é a soma de pequenos esforços repetidos diariamente.",
        "Acredite em si mesmo!",
        "Você é mais forte do que pensa.",
        "Cada dia é uma nova oportunidade.",
        "Confie no processo e no tempo certo.",
        "A persistência é o caminho do êxito.",
        "Transforme desafios em oportunidades.",
        "A felicidade está no caminho, não no destino.",
        "Seja a mudança que você deseja ver no mundo."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnShowMessage.setOnClickListener {
            // Selecionar mensagem aleatória
            val randomMessage = messages[Random.nextInt(messages.size)]
            binding.tvMessage.text = randomMessage
        }
    }
}