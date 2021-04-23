package vitor.treino.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object {
        val INFO_EXTRA_MENSAGEM = "MENSAGEM"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMenagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextTextMessage)

        val mensagem = editTextMensagem.text.toString()

        val intent = Intent(this, MostraMensagemActivity::class.java).apply {
            putExtra(INFO_EXTRA_MENSAGEM , mensagem)
        }


        startActivity(intent)
    }
}