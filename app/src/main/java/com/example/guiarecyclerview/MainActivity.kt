package com.example.guiarecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guiarecyclerview.adapter.ItemAdapter
import com.example.guiarecyclerview.model.Nomes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = Nomes()

        nome.addValor("Neymar")
        nome.addValor("Messi")
        nome.addValor("Mbappé")
        nome.addValor("Haaland")
        nome.addValor("Vini Jr")
        nome.addValor("Cristiano")
        nome.addValor("Courtois")
        nome.addValor("Lewandowiski")
        nome.addValor("Nouer")
        nome.addValor("Ramos")


        val recyclerLista = findViewById<RecyclerView>(R.id.rvLista)

        recyclerLista.adapter = ItemAdapter(nome.getList())

        recyclerLista.layoutManager = LinearLayoutManager(this) //definir qual o layout
    // manager da recycler view

        recyclerLista.setHasFixedSize(true) //fazer com que tenha um tamanho único
    }
}