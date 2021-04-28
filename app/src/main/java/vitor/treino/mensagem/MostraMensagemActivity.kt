package vitor.treino.mensagem

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        //val date  = Calendar.getInstance().time
        //val dataView = findViewById<TextView>(R.id.dataView)

        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)

        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)

        textViewMensagem.setText(mensagem)
        //dataView.setText(date.toString())
    }
}