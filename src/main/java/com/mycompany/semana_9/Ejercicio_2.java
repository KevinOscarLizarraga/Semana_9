package com.mycompany.semana_9;

import Clases.Lista;

/* Lizarraga Paquiyauri Kevin */
public class Ejercicio_2 {

    public static void main(String[] args) {

        Lista listal = new Lista();
        listal.Insertar_Inicio(26);
        listal.Insertar_Inicio(50);
        listal.Insertar_Inicio(34);
        listal.Insertar_Inicio(37);
        listal.Insertar_Inicio(21);
        listal.Insertar_Inicio(10);
        listal.Insertar_Ultimo(100);
        System.out.println("Numeros pares de la lista : " + listal.Pares());
        System.out.println(listal.Mostrar());
        System.out.println(listal);
        listal.Eliminar_Inicio();
        System.out.println(listal);
        listal.Eliminar_Ultimo();
        System.out.println(listal);
        System.out.println(listal.Mostrar());
    }

}
