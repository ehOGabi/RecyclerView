package com.example.guiarecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.guiarecyclerview.R

class ItemAdapter(private val listNome: List<String>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textNome = view.findViewById<TextView>(R.id.txtValor)

    }

    //vai configurar os itens no xml que vamos utilizar aqui, para eles terem acesso aos dados
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        return ItemViewHolder(adapterLayout)
    }
    //como nós manipulamos os dados da lista
    //como os valores da lista vão ser passados para o textView
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = listNome[position] //vai recuperar o valor das posições da lista

        holder.textNome.text = item //o txtValor (lá da linha 14) vai ser igual a
    // posição recuperada da lista
    }

    override fun getItemCount(): Int {
        return listNome.size //vai retornar a quantidade de valores da lista
    }

}