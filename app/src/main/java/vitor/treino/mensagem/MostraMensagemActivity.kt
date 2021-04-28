package vitor.treino.mensagem

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        //val date  = Calendar.getInstance().time

        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)
        val data: Date = intent.getSerializableExtra(MainActivity.INFO_EXTRA_DATA) as Date

        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        val dataView = findViewById<TextView>(R.id.dataView)

        textViewMensagem.setText(mensagem)
        dataView.setText(data.toString())
    }
}