/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package taken;
import java.awt.Dimension;
import java.awt.Toolkit;


public class Juego extends javax.swing.JFrame {
    //private int[][] tablero; // Representación del tablero como matriz bidimensional
    /*
     * 1 2 3 4
     * 5 6 7 8
     * 9 10 11 12
     * 13 14 15 []
     * 
     */
    
    TakenLogica logica = new TakenLogica();
    
   // private JButton[][] botones; // Botones de la interfaz
    private TakenLista listaLigada; 
    //private int contadorMovimientos; 
    
    private final int[][] formaS1 = {{7, 8, 9, 10}, {6, 1, 2, 11}, {5, 4, 3, 12}, {0, 15, 14, 13}};
    private final int[][] formaS2 = {{15, 14, 13, 12}, {11, 10, 9, 8}, {7, 6, 5, 4}, {3, 2, 1, 0}};
    private final int[][] formaS3 = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 0, 15, 6}, {10, 9, 8, 7}};
    private final int[][] formaS4 = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 0}};


    public Juego() {
        initComponents();
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
        
        
       logica.inicializarTablero();
       logica.vincularBotones(uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez,
            once, doce, trece, catorce, quince, vacio);
       //listaLigada = new TakenLista(4);
    }

    private void inicializarTablero() {
        logica.inicializarTablero();
    }
        
    private void moverFicha(int fila, int columna) {
    logica.moverFicha(fila, columna);
    int contadorMovimientos = logica.actualizarContadorMovimientos();
    actualizarMovimientos(contadorMovimientos); // Actualiza el contador de movimientos en la interfaz
}
  


    private void actualizarTableroYInterfaz() {
        logica.actualizarTableroYInterfaz();
    }

    private void actualizarContadorMovimientos() {
        int i = logica.actualizarContadorMovimientos();
        movs.setText(" Movimientos: " + i);
    }
    
    private void mostrarMensajeGanador(){
        logica.mostrarMensajeGanador();
        reiniciarJuego();
    }
    
    private boolean esGanador(){
        return logica.esGanador();
    }
    


///Arreglo de los botones
private void vincularBotones() {
    logica.vincularBotones(uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez,
            once, doce, trece, catorce, quince, vacio);
}


private void actualizarTableroInterfaz() {
    logica.actualizarTableroInterfaz();
}

public void actualizarMovimientos(int contadorMovimientos) {
    movs.setText(" Movimientos: " + contadorMovimientos);
}

public void reiniciarJuego() {
    // Reiniciar el tablero y cualquier otra lógica necesaria
    inicializarTablero();
    int contadorMovimientos = 0; // Reiniciar el contador de movimientos
    actualizarMovimientos(0);
    
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        diez = new javax.swing.JButton();
        once = new javax.swing.JButton();
        doce = new javax.swing.JButton();
        trece = new javax.swing.JButton();
        catorce = new javax.swing.JButton();
        quince = new javax.swing.JButton();
        vacio = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        reiniciar = new javax.swing.JButton();
        solucion = new javax.swing.JButton();
        s1 = new javax.swing.JButton();
        s2 = new javax.swing.JButton();
        s3 = new javax.swing.JButton();
        s4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        movs = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(java.awt.Color.red);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(0, 204, 204));
        Titulo.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 2, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(204, 204, 204));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Juego del 15 (Taken)");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 425, 48));

        uno.setBackground(new java.awt.Color(0, 153, 255));
        uno.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        uno.setForeground(new java.awt.Color(255, 255, 255));
        uno.setText("1");
        uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        getContentPane().add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 79, 90, 90));

        dos.setBackground(new java.awt.Color(0, 153, 153));
        dos.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        dos.setForeground(new java.awt.Color(255, 255, 255));
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        getContentPane().add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 79, 90, 90));

        tres.setBackground(new java.awt.Color(0, 153, 255));
        tres.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        getContentPane().add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 79, 90, 90));

        cuatro.setBackground(new java.awt.Color(0, 153, 153));
        cuatro.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cuatro.setForeground(new java.awt.Color(255, 255, 255));
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        getContentPane().add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 79, 90, 90));

        cinco.setBackground(new java.awt.Color(0, 153, 255));
        cinco.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        getContentPane().add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 176, 90, 90));

        seis.setBackground(new java.awt.Color(0, 153, 153));
        seis.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        getContentPane().add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 176, 90, 90));

        siete.setBackground(new java.awt.Color(0, 153, 255));
        siete.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        siete.setForeground(new java.awt.Color(255, 255, 255));
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        getContentPane().add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 176, 90, 90));

        ocho.setBackground(new java.awt.Color(0, 153, 153));
        ocho.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        ocho.setForeground(new java.awt.Color(255, 255, 255));
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        getContentPane().add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 176, 90, 90));

        nueve.setBackground(new java.awt.Color(0, 153, 255));
        nueve.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        nueve.setForeground(new java.awt.Color(255, 255, 255));
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        getContentPane().add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 273, 90, 90));

        diez.setBackground(new java.awt.Color(0, 153, 153));
        diez.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        diez.setForeground(new java.awt.Color(255, 255, 255));
        diez.setText("10");
        diez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diezActionPerformed(evt);
            }
        });
        getContentPane().add(diez, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 273, 90, 90));

        once.setBackground(new java.awt.Color(0, 153, 255));
        once.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        once.setForeground(new java.awt.Color(255, 255, 255));
        once.setText("11");
        once.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onceActionPerformed(evt);
            }
        });
        getContentPane().add(once, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 273, 90, 90));

        doce.setBackground(new java.awt.Color(0, 153, 153));
        doce.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        doce.setForeground(new java.awt.Color(255, 255, 255));
        doce.setText("12");
        doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doceActionPerformed(evt);
            }
        });
        getContentPane().add(doce, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 273, 90, 90));

        trece.setBackground(new java.awt.Color(0, 153, 255));
        trece.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        trece.setForeground(new java.awt.Color(255, 255, 255));
        trece.setText("13");
        trece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treceActionPerformed(evt);
            }
        });
        getContentPane().add(trece, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 370, 90, 90));

        catorce.setBackground(new java.awt.Color(0, 153, 153));
        catorce.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        catorce.setForeground(new java.awt.Color(255, 255, 255));
        catorce.setText("14");
        catorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catorceActionPerformed(evt);
            }
        });
        getContentPane().add(catorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 370, 90, 90));

        quince.setBackground(new java.awt.Color(0, 153, 255));
        quince.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        quince.setForeground(new java.awt.Color(255, 255, 255));
        quince.setText("15");
        quince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quinceActionPerformed(evt);
            }
        });
        getContentPane().add(quince, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 370, 90, 90));

        vacio.setBackground(new java.awt.Color(204, 204, 204));
        vacio.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        vacio.setForeground(new java.awt.Color(255, 255, 255));
        vacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacioActionPerformed(evt);
            }
        });
        getContentPane().add(vacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 90, 90));
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 478, 456, 10));

        reiniciar.setBackground(new java.awt.Color(204, 204, 255));
        reiniciar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.setBorder(new javax.swing.border.MatteBorder(null));
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 120, 40));

        solucion.setBackground(new java.awt.Color(204, 204, 255));
        solucion.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        solucion.setText("Soluciones");
        solucion.setBorder(new javax.swing.border.MatteBorder(null));
        solucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solucionActionPerformed(evt);
            }
        });
        getContentPane().add(solucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 120, 40));

        s1.setBackground(new java.awt.Color(204, 204, 255));
        s1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        s1.setText("Solucion 1");
        s1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        s2.setBackground(new java.awt.Color(204, 204, 255));
        s2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        s2.setText("Solucion 2");
        s2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, -1, -1));

        s3.setBackground(new java.awt.Color(204, 204, 255));
        s3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        s3.setText("Solucion 3");
        s3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, -1));

        s4.setBackground(new java.awt.Color(204, 204, 255));
        s4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        s4.setText("Solucion 4");
        s4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));

        movs.setEditable(false);
        movs.setBackground(new java.awt.Color(0, 153, 153));
        movs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        movs.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        movs.setText(" Movimientos: 0");
        movs.setToolTipText("");
        movs.setSelectedTextColor(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(movs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 270, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DALL·E 2023-11-22 23.56.57 - A simple, wide background with a smooth gradient, using slightly darker shades of blue and green. The background should be completely plain, without a.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -90, 470, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solucionActionPerformed
   
                soluciones frame = new soluciones();

                // Obtener las dimensiones de la pantalla
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int width = screenSize.width;
                int height = screenSize.height;

                // Calcular la posición para que la ventana aparezca a la derecha con un margen
                
                int margenDerecho = 60; // Margen derecho en píxeles
                int x = width - frame.getWidth() - margenDerecho;
                int y = (height - frame.getHeight()) / 2; // Centrado verticalmente

                // Establecer la posición de la ventana
                frame.setLocation(x, y);

                frame.setVisible(true);
                
                // Hacer visibles los botones
                s1.setVisible(true);
                s2.setVisible(true);
                s3.setVisible(true);
                s4.setVisible(true);

    }//GEN-LAST:event_solucionActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // Actualiza el tablero con los valores de formaS4
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                logica.tablero[i][j] = formaS4[i][j];
            }
        }
        actualizarTableroInterfaz();
        if(esGanador()){
        mostrarMensajeGanador(); 
        }
      
    }//GEN-LAST:event_s4ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // Actualiza el tablero con los valores de formaS1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                logica.tablero[i][j] = formaS1[i][j];
            }
        }
        actualizarTableroInterfaz();
        if(esGanador()){
        mostrarMensajeGanador();    
        }
      
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // Actualiza el tablero con los valores de formaS2
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                logica.tablero[i][j] = formaS2[i][j];
            }
        }
        actualizarTableroInterfaz();
        if(esGanador()){
        mostrarMensajeGanador();    
        }
      
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // Actualiza el tablero con los valores de formaS3
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                logica.tablero[i][j] = formaS3[i][j];
            }
        }
        actualizarTableroInterfaz();
        if(esGanador()){
        mostrarMensajeGanador();    
        }
      
    }//GEN-LAST:event_s3ActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(0, 0);
    }

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(0, 1);
    }

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(0, 2);
    }

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(0, 3);
    }

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(1, 0);
    }

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(1, 1);
    }

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(1, 2);
    }

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(1, 3);
    }

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(2, 0);
    }

    private void diezActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(2, 1);
    }

    private void onceActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(2, 2);
    }

    private void doceActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(2, 3);
    }

    private void treceActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(3, 0);
    }

    private void catorceActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(3, 1);
    }

    private void quinceActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(3, 2);
    }

    private void vacioActionPerformed(java.awt.event.ActionEvent evt) {
        moverFicha(3, 3);
    }

   private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {
    logica.reiniciarActionPerformed(evt);
    reiniciarJuego();
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton catorce;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton diez;
    private javax.swing.JButton doce;
    private javax.swing.JButton dos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextPane movs;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton once;
    private javax.swing.JButton quince;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton s1;
    private javax.swing.JButton s2;
    private javax.swing.JButton s3;
    private javax.swing.JButton s4;
    private javax.swing.JButton seis;
    private javax.swing.JSeparator separador;
    private javax.swing.JButton siete;
    private javax.swing.JButton solucion;
    private javax.swing.JButton trece;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    private javax.swing.JButton vacio;
    // End of variables declaration//GEN-END:variables
}
