package Ejercicio84;

/* Lizarraga Paquiyauri Kevin */
public class Nodo {

    String dato;
    Nodo enlace;

    public Nodo(String entrada) {
        dato = entrada;
        enlace = this; // se apunta asímismo
    }
}
