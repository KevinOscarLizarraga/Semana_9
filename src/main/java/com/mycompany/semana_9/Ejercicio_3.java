package com.mycompany.semana_9;

import java.util.ArrayList;
import java.util.Scanner;

/* Lizarraga Paquiyauri Kevin */
public class Ejercicio_3 {

    ArrayList<Double> LInumeros;

    public static void main(String[] args) {
        Ejercicio_3 miLista = new Ejercicio_3();
        miLista.LInumeros = new ArrayList();
        miLista.leerOpcion();
    }
    public void leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nLista de números");
            System.out.println("[1] Agregar");
            System.out.println("[2] Buscar");
            System.out.println("[3] Modificar elemento");
            System.out.println("[4] Eliminar elemento");
            System.out.println("[5] Insertar elemento");
            System.out.println("[6] Mostrar elemento");
            System.out.println("[7] Salir\n");
            System.out.println("Ingrese opcion (1-7) : ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    buscarValor();
                    break;
                case 3:
                    modificarValor();
                    break;
                case 4:
                    eliminarValor();
                    break;
                case 5:
                    insertarValor();
                    break;
                case 6:
                    mostrarLista();
                    break;
                case 7:
            }
        } while (opcion != 7);
    }

    public void ingresarValor() {
        Scanner teclado = new Scanner(System.in);
        double valor;
        System.out.println("Valor a buscar: ");
        valor = teclado.nextDouble();
        LInumeros.add(valor);
    }

    public void buscarValor() {
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("Valor a buscar: ");
        valor = teclado.nextDouble();
        indice = LInumeros.indexOf(valor);
        if (indice != -1) {
            System.out.println("Dato se encuentra en posicion: " + indice);
        } else {
            System.out.println("dato no se encuentra");
        }
    }

    public void modificarValor() {
        Scanner teclado = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;
        System.out.println("Valor a modificar: ");
        valor = teclado.nextDouble();
        indice = LInumeros.indexOf(valor);
        if (indice != -1) {
            System.out.println("Nuevo valor: ");
            nuevoValor = teclado.nextDouble();
            LInumeros.set(indice, nuevoValor);
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void eliminarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("Valor a modificar: ");
        valor = entrada.nextDouble();
        indice = LInumeros.indexOf(valor);
        if (indice != -1) {
            LInumeros.remove(indice);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void insertarValor() {
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("Valor a insertar: ");
        valor = teclado.nextDouble();
        System.out.println("posicion donde desea insertar: ");
        indice = teclado.nextInt();
        LInumeros.add(indice, valor);
    }

    public void mostrarLista() {
        if (!LInumeros.isEmpty()) {
            System.out.println("Elementos de la Lista: ");
            for (int i = 0; i < LInumeros.size(); i++) {
                System.out.println(LInumeros.get(i));
            }
        } else {
            System.out.println("No existen valores en la lista");
        }
    }
}
