/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class Inicio extends javax.swing.JFrame {

    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    Modelo3x3 turno1 = new Modelo3x3();
    Modelo3x3 turno2 = new Modelo3x3();

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trikitrake");

        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComenzar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComenzar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        JTextField nom1Field = new JTextField(5);
        JTextField nom2Field = new JTextField(5);

        JPanel myPanel = new JPanel();

        //Jugador1
        String[] tablero = {"3x3", "4x4", "5x5"};
        JComboBox<String> tabla = new JComboBox<>(tablero);
        myPanel.add(new JLabel("Seleccione un tablero: "));
        myPanel.add(tabla);
        myPanel.add(Box.createHorizontalStrut(15));

        myPanel.add(new JLabel("Nombre Jugador1:"));
        myPanel.add(nom1Field);
        myPanel.add(Box.createHorizontalStrut(15));

        //colorComboBox
        String[] colores = {"Rojo", "Azul", "Morado", "Verde", "Rosado", "Naranja", "Vino", "Negro"};
        JComboBox<String> colorComboBox = new JComboBox<>(colores);
        myPanel.add(new JLabel("Color Jugador1:"));
        myPanel.add(colorComboBox);
        myPanel.add(Box.createHorizontalStrut(15));

        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcionColor = (String) colorComboBox.getSelectedItem();
                jugador1.setOpcion(opcionColor);
            }
        });

        //Jugador2
        myPanel.add(new JLabel("Nombre Jugador2:"));
        myPanel.add(nom2Field);
        myPanel.add(Box.createHorizontalStrut(15));

        //colorComboBox2
        String[] colores2 = {"Rojo", "Azul", "Morado", "Verde", "Rosado", "Naranja", "Vino", "Negro"};
        JComboBox<String> colorComboBox2 = new JComboBox<>(colores2);
        myPanel.add(new JLabel("Color Jugador2:"));
        myPanel.add(colorComboBox2);
        myPanel.add(Box.createHorizontalStrut(15));

        colorComboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcionColor = (String) colorComboBox2.getSelectedItem();
                jugador2.setOpcion(opcionColor);
            }
        });

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Introducir la siguiente información", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String seleccion = (String) tabla.getSelectedItem();
            if ("3x3".equals(seleccion)) {
                Modelo3x3 modelito = new Modelo3x3();
                Tablero3x3 tablerito = new Tablero3x3();
                Tablero_3x3 tab = new Tablero_3x3(tablerito, modelito);
                //**************************
                String textoJugador1 = nom1Field.getText();
                tablerito.getLblJugador1().setText(textoJugador1);
                String textoJugador2 = nom2Field.getText();
                tablerito.getLblJugador2().setText(textoJugador2);
                //*************************
                if ("X".equals(modelito.getTurno())) {
                    Color colorTexto = jugador1.getColor();
                    tablerito.getLblJugador1().setForeground(colorTexto);
                }
                if ("O".equals(modelito.getTurno())) {
                    Color colorTexto = jugador2.getColor();
                    tablerito.getLblJugador2().setForeground(colorTexto);
                }
                tablerito.setVisible(true);
            } else if ("4x4".equals(seleccion)) {
                Modelo4x4 modeloN = new Modelo4x4();
                Tablero4x4 tableroN = new Tablero4x4();
                Tablero_4x4 tab = new Tablero_4x4(tableroN, modeloN);
                //**************************
                String textoJugador1 = nom1Field.getText();
                tableroN.getLblJugador1().setText(textoJugador1);
                String textoJugador2 = nom2Field.getText();
                tableroN.getLblJugador2().setText(textoJugador2);
                //*************************
                if ("X".equals(modeloN.getTurno())) {
                    Color colorTexto = jugador1.getColor();
                    tableroN.getLblJugador1().setForeground(colorTexto);
                }
                if ("O".equals(modeloN.getTurno())) {
                    Color colorTexto = jugador2.getColor();
                    tableroN.getLblJugador2().setForeground(colorTexto);
                }
                tableroN.setVisible(true);
            } else {
                Modelo5x5 modelote = new Modelo5x5();
                Tablero5x5 tablerote = new Tablero5x5();
                Tablero_5x5 tab = new Tablero_5x5(tablerote, modelote);
                //**************************
                String textoJugador1 = nom1Field.getText();
                tablerote.getLblJugador1().setText(textoJugador1);
                String textoJugador2 = nom2Field.getText();
                tablerote.getLblJugador2().setText(textoJugador2);
                //*************************
                if ("X".equals(modelote.getTurno())) {
                    Color colorTexto = jugador1.getColor();
                    tablerote.getLblJugador1().setForeground(colorTexto);
                }
                if ("O".equals(modelote.getTurno())) {
                    Color colorTexto = jugador2.getColor();
                    tablerote.getLblJugador2().setForeground(colorTexto);
                }
                tablerote.setVisible(true);
            }


    }//GEN-LAST:event_btnComenzarActionPerformed
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
