package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtCadastro:EditText = findViewById(R.id.edtNome)
        val edtEndereço:EditText = findViewById(R.id.edtEndereço)
        val edtBairro:EditText = findViewById(R.id.edtBairro)
        val edtCidade:EditText = findViewById(R.id.edtCidade)
        val edtEstado:EditText = findViewById(R.id.edtEstado)
        val edtCep:EditText = findViewById(R.id.edtCep)
        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener{

            val toastInf = Toast.makeText(this,"As informações inseridas foram: ", Toast.LENGTH_SHORT)


                     val toastRes= Toast.makeText(this, edtCadastro.text.toString()

                             +"\n" + edtEndereço.text.toString()
                             +"\n" + edtBairro.text.toString()
                             +"\n" + edtCidade.text.toString()
                             +"\n" + edtEstado.text.toString()
                             +"\n" + edtCep.text.toString(),Toast.LENGTH_SHORT)

                                  val toastUltInf = Toast.makeText(this,"Todas as informações inseridas, foram enviadas com sucesso", Toast.LENGTH_SHORT)

                                      toastInf.show()
                                          toastRes.show()
                                              toastUltInf.show()

        }
    }
}