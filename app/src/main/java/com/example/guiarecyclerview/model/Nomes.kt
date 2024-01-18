package com.example.guiarecyclerview.model

class Nomes {
    private val listNomes = mutableListOf<String>()

    fun addValor(valor: String){
        listNomes.add(valor)
    }
    fun getList(): List<String>{
        return listNomes
    }

}