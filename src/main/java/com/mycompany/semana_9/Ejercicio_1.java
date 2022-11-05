
package com.mycompany.semana_9;

import Clases.Persona;
import java.util.ArrayList;
import java.util.List;

/* Lizarraga Paquiyauri Kevin */

public class Ejercicio_1 {

    public static void main(String[] args) {

        List<Persona> lis_persona = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Persona per = new Persona();
            per.setCodigo(i);
            per.setNombre("Walter" + i);
            per.setApellido("Reyes" + i);
            per.setEdad(25 +i );
            lis_persona.add(per);
        }
        System.out.println("Tamaño de Lista" + lis_persona.size());
        
        for (Persona p: lis_persona){
            System.out.println("Codigo : " + p.getCodigo());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido;: " + p.getApellido());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("----------------------");
        }
        
 /*Parte 3 
        System.out.println("Dato Lista : " +
                lis_persona.get(0).getNombre() +
                "  " + 
                lis_persona.get(0).getApellido());
         */
 /*Inicio
        List<String> lis_nombre = new ArrayList<>();
    
        lis_nombre.add("walter");
        lis_nombre.add("paul");
        lis_nombre.add("samuel");
        lis_nombre.add("sonia");
         */
 /* Parte 1
        System.out.println("Tamaño : " + lis_nombre.size());
        
        System.out.println("Dato posicion : " + lis_nombre.get(0));
        
        lis_nombre.remove(1);
        
        System.out.println("Tamaño : " +lis_nombre.size());
         */
 /* Parte 2
        for (String n : lis_nombre) {
            System.out.println("Nombre : " + n);
        }
         */
    }
}
