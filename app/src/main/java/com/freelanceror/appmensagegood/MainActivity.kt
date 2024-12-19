package com.freelanceror.appmensagegood

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

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

        binding.tvMessage.setOnClickListener {
            val messageToShare = binding.tvMessage.text.toString()
            compartilharMensagem(messageToShare)
        }
    }

    private fun compartilharMensagem(mensagem: String) {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, mensagem)

        // Cria um chooser para o usuário escolher o app
        val chooser = Intent.createChooser(shareIntent, "Compartilhar via")
        startActivity(chooser)
    }
}