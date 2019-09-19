package com.projetorpg.test.exemploaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // referencia o nosso botão criado no arquivo XML através do ID
        val meuBotao = findViewById<Button>(R.id.botao)

        // quando o botão for pressionado,
        // o corpo da função abaixo será executado
        meuBotao.setOnClickListener {

            // referencia os nossos dois campos de texto, i.e., 'ed_login' e 'ed_senha'
            // criados a partir do nosso arquivo XML através do ID
            val login = findViewById<EditText>(R.id.ed_login)
            val senha = findViewById<EditText>(R.id.ed_senha)

            // verifica se o login existe (este é um exemplo demonstrativo, por tanto, não usaremos
            // conexão com banco de dados para não tornar defasado o entendimento da aplicação)
            if(login.text.toString() == "admin" && senha.text.toString() == "admin123"){

                // mostra a mensagem para o administrador
                Toast.makeText(applicationContext, "bem-vindo administrador", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}
