package Ejercicio84;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Lizarraga Paquiyauri Kevin */
public class ListaPalabras {

    public static void main(String[] a) throws IOException {
        String palabra;
        ListaCircular listaCp;
        int opc;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        listaCp = new ListaCircular();
        System.out.println("\n Entrada de Nombres. Termina con ^Z.\n");
        while ((palabra = entrada.readLine()) != null) {
            String nueva;
            nueva = palabra;
            listaCp.insertar(nueva);
        }
        System.out.println("\t\tLista circular de palabras");
        listaCp.recorrer();
        System.out.println("\n\t Opciones para manejar la lista");
        do {
            System.out.println("1. Eliminar una palabra.\n");
            System.out.println("2. Mostrar la lista completa.\n");
            System.out.println("3. Salir y eliminar la lista.\n");
            do {
                opc = Integer.parseInt(entrada.readLine());
            } while (opc < 1 || opc > 3);
            switch (opc) {
                case 1 -> {
                    System.out.print("Palabra a eliminar: ");
                    palabra = entrada.readLine();
                    listaCp.eliminar(palabra);
                }
                case 2 -> {
                    System.out.println("Palabras en la Lista:\n");
                    listaCp.recorrer();
                }
                case 3 -> {
                    System.out.print("Eliminación de la lista.");
                    listaCp.borrarLista();
                }
            }
        } while (opc != 3);
    }
}
