/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taken;
public class TakenNodo {
    int valor; // Valor del nodo, 0 para el espacio vacío
    int fila; // Fila del nodo en el tablero
    int columna; // Columna del nodo en el tablero
    TakenNodo anterior; // Referencia al nodo anterior en la lista
    TakenNodo siguiente; // Referencia al nodo siguiente en la lista

    // Constructor para inicializar el nodo
    public TakenNodo(int valor, int fila, int columna) {
        this.valor = valor;
        this.fila = fila;
        this.columna = columna;
        this.anterior = null;
        this.siguiente = null;
    }

    // Métodos getters y setters para valor, fila, columna, anterior y siguiente
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public TakenNodo getAnterior() {
        return anterior;
    }

    public void setAnterior(TakenNodo anterior) {
        this.anterior = anterior;
    }

    public TakenNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(TakenNodo siguiente) {
        this.siguiente = siguiente;
    }
}
