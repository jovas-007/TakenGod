/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taken;
public class TakenLista {
    TakenNodo cabeza;
    TakenNodo nodoVacio; // Nodo que representa el espacio vacío en el tablero
    int dimension; // Dimension del tablero, por ejemplo, 4 para un tablero 4x4

    public TakenLista(int dimension) {
        this.dimension = dimension;
        this.cabeza = null;
        TakenNodo ultimo = null; // Referencia al último nodo agregado

        int contador = 1; // Contador para asignar valores a los nodos

        // Crear nodos para cada posición del tablero
        for (int fila = 0; fila < dimension; fila++) {
            for (int columna = 0; columna < dimension; columna++) {
                TakenNodo nuevoNodo = new TakenNodo(contador, fila, columna);

                // Si la lista está vacía, el nuevo nodo es la cabeza
                if (this.cabeza == null) {
                    this.cabeza = nuevoNodo;
                } else {
                    // Enlazar el nuevo nodo con el último nodo
                    ultimo.setSiguiente(nuevoNodo);
                    nuevoNodo.setAnterior(ultimo);
                }

                // Actualizar el último nodo agregado
                ultimo = nuevoNodo;

                // Incrementar el contador, el último nodo será el espacio vacío
                if (contador < dimension * dimension) {
                    contador++;
                } else {
                    // El último nodo es el espacio vacío
                    nuevoNodo.setValor(0);
                    this.nodoVacio = nuevoNodo;
                }
            }
        }
    }


    // Método para mover un nodo
    public boolean moverNodo(int valor) {
        TakenNodo nodoObjetivo = encontrarNodo(valor);
        if (nodoObjetivo == null || nodoVacio == null) {
            return false; // Nodo no encontrado o no hay nodo vacío
        }

        // Verifica si el nodo objetivo es adyacente al nodo vacío
        if (esAdyacente(nodoObjetivo, nodoVacio)) {
            // Intercambia los valores de los nodos
            int temp = nodoVacio.valor;
            nodoVacio.valor = nodoObjetivo.valor;
            nodoObjetivo.valor = temp;

            // Actualiza el nodo vacío
            nodoVacio = nodoObjetivo;
            return true;
        }

        return false;
    }

    // Método para verificar si dos nodos son adyacentes
    private boolean esAdyacente(TakenNodo nodo1, TakenNodo nodo2) {
        // Verifica si los nodos son adyacentes en un tablero 2D
        return Math.abs(nodo1.fila - nodo2.fila) + Math.abs(nodo1.columna - nodo2.columna) == 1;
    }

    // Método para encontrar un nodo con un valor específico
    public TakenNodo encontrarNodo(int valor) {
        TakenNodo temp = cabeza;
        while (temp != null) {
            if (temp.valor == valor) {
                return temp;
            }
            temp = temp.siguiente;
        }
        return null; // No se encontró el nodo
    }


}
