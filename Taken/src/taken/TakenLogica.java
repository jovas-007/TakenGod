package taken;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TakenLogica extends javax.swing.JFrame{
    public int[][] tablero;
    int contadorMovimientos = 0; 
    TakenLista listaLigada = new TakenLista(4);
    private JButton[][] botones; // Botones de la interfaz
    
     void vincularBotones(JButton boton1, JButton boton2, JButton boton3, JButton boton4, JButton boton5,
             JButton boton6, JButton boton7, JButton boton8, JButton boton9, JButton boton10, JButton boton11,
             JButton boton12, JButton boton13, JButton boton14, JButton boton15, JButton botonvacio) {
      botones = new JButton[][] {
        {boton1, boton2, boton3, boton4},
        {boton5, boton6, boton7, boton8},
        {boton9, boton10, boton11, boton12},
        {boton13, boton14, boton15, botonvacio} };


    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (tablero[i][j] != 0) {
                botones[i][j].setText(String.valueOf(tablero[i][j]));
            } else {
                botones[i][j].setText(""); // Espacio vacío
            }
        }
    }
}
    
    public void inicializarTablero() {
        int m =0;
        
        tablero = new int[4][4];
        int contador = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (contador < 16) {
                    tablero[i][j] = contador++;
                } else {
                    tablero[i][j] = 0; // Espacio vacío
                }
            }
        }
    }
    
    public void reiniciarContador(){
        contadorMovimientos = 0;
    }
    
   public int actualizarContadorMovimientos() {
    // Incrementa y devuelve el contador de movimientos
    
    return contadorMovimientos;
}

    
   public void actualizarTableroYInterfaz() {
        TakenNodo actual = listaLigada.cabeza;
        while (actual != null) {
            tablero[actual.getFila()][actual.getColumna()] = actual.getValor();
            JButton botonActual = botones[actual.getFila()][actual.getColumna()];

            if (actual.getValor() != 0) {
                botonActual.setText(String.valueOf(actual.getValor()));
                // Cambiar el color según si el número es par o impar
                if (actual.getValor() % 2 == 0) {
                    botonActual.setBackground(new Color(0, 153, 153)); // Color para números pares
                } else {
                    botonActual.setBackground(new Color(0, 153, 255)); // Color para números impares
                }
            } else {
                botonActual.setText(""); // Espacio vacío
                botonActual.setBackground(Color.GRAY); // Color para el espacio vacío
            }

            actual = actual.getSiguiente();
        }
    }
    
    
    //Metodos para comprobar si gano
    boolean esGanador() {
    return esGanadorForma1() || esGanadorForma2() || esGanadorForma3() || esGanadorForma4();
    }

    private boolean esGanadorForma1() {
        int[][] forma1 = {{7, 8, 9, 10}, {6, 1, 2, 11}, {5, 4, 3, 12}, {0, 15, 14, 13}};
        return compararTableroConForma(forma1);
    }
    private boolean esGanadorForma2() {
        int[][] forma2 = {{15, 14, 13, 12}, {11, 10, 9, 8}, {7, 6, 5, 4}, {3, 2, 1, 0}};
        return compararTableroConForma(forma2);
    }
    private boolean esGanadorForma3() {
        int[][] forma3 = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 0, 15, 6}, {10, 9, 8, 7}};
        return compararTableroConForma(forma3);
    }
    private boolean esGanadorForma4() {
        int[][] forma4 = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 0}};
        return compararTableroConForma(forma4);
    }
    
    private boolean compararTableroConForma(int[][] forma) {
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (tablero[i][j] != forma[i][j]) {
                return false;
            }
        }
    }
    return true;
    }
    
    void mostrarMensajeGanador() {
    // Opciones para los botones
    Object[] opciones = {"Reiniciar", "Cerrar"};

    // Mostrar el JOptionPane con dos botones
    int eleccion = JOptionPane.showOptionDialog(this, 
    "¡Felicidades! Has ganado el juego en " + contadorMovimientos + " movimientos.", "Juego Terminado", 
    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, 
    null, opciones, opciones[0]);

    
    // Acciones según la elección del usuario
    if (eleccion == JOptionPane.YES_OPTION) {
        // Restablece la lista ligada
    listaLigada = new TakenLista(4); 

    // Restablece el tablero y actualiza la interfaz
    inicializarTablero();
    actualizarTableroYInterfaz();

    reiniciarContador(); // Reinicia el contador de movimientos
    actualizarContadorMovimientos(); // Actualiza el contador en la interfaz
    
    } else if (eleccion == JOptionPane.NO_OPTION) {
        // Cerrar el juego
        System.exit(0);
        

    }
}

    private void desactivarTablero() {
    for (int i = 0; i < botones.length; i++) {
        for (int j = 0; j < botones[i].length; j++) {
            botones[i][j].setEnabled(false); // Deshabilita el botón
        }
    }
}


    
    void moverFicha(int fila, int columna) {
    // Obtener el valor del nodo en la posición dada
    int valorDelNodo = tablero[fila][columna];

    // Verificar si el nodo seleccionado no es el espacio vacío
    if (valorDelNodo != 0) {
        // Intentar mover el nodo
        if (listaLigada.moverNodo(valorDelNodo)) { // Suponiendo que moverNodo devuelve true si el movimiento es válido
            contadorMovimientos += 1; // Incrementa el contador solo si el movimiento es válido
            // No actualiza la interfaz aquí
            actualizarTableroYInterfaz(); // Actualiza el tablero y la interfaz después del movimiento
            if (esGanador()) {
                mostrarMensajeGanador();
            }
        }
    }
}
 
    
    void actualizarTableroInterfaz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton botonActual = botones[i][j];
                int valorActual = tablero[i][j];

                if (valorActual != 0) {
                    botonActual.setText(String.valueOf(valorActual));
                    // Cambiar el color según si el número es par o impar
                    if (valorActual % 2 == 0) {
                        botonActual.setBackground(new Color(0, 153, 153)); // Color para números pares
                    } else {
                        botonActual.setBackground(new Color(0, 153, 255)); // Color para números impares
                    }
                } else {
                    botonActual.setText(""); // Espacio vacío
                    botonActual.setBackground(Color.GRAY); // Color para el espacio vacío
                }
            }
        }
    }

    
    void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {
    // Restablece la lista ligada
    listaLigada = new TakenLista(4); // Asumiendo que la dimensión del tablero es 4x4

    // Restablece el tablero y actualiza la interfaz
    inicializarTablero();
    actualizarTableroYInterfaz();

    reiniciarContador(); // Reinicia el contador de movimientos
    actualizarContadorMovimientos(); // Actualiza el contador en la interfaz
    
    }
}

