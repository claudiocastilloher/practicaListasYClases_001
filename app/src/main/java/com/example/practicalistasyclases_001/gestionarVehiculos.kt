package com.example.practicalistasyclases_001

import com.example.practicalistasyclases_001.data.Vehiculos

fun gestionarVehiculos(): MutableList<Vehiculos>{

    //Crear una listas mutable vacia
    val listaVehiculos = mutableListOf<Vehiculos>()

    //Agregar vehiculos
    listaVehiculos.add(Vehiculos("Chevrolet","Silverado",2010))
    listaVehiculos.add(Vehiculos("Nissan","Tsuru",2009))
    listaVehiculos.add(Vehiculos("Nissan","Urvan",2015))

    //Retornar la lista Mutable
    return listaVehiculos

}