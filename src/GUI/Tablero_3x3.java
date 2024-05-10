/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Tablero_3x3 {

    private Tablero3x3 tablerito;
    private Modelo3x3 model;
    private JLabel[][] casillas;

    public Tablero_3x3(Tablero3x3 tablerito, Modelo3x3 model) {
        this.tablerito = tablerito;
        this.model = model;
        casillas = tablerito.getCasillas();
        moreEvents();
        puntajes();
    }

    private void moreEvents() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                addEventClick(i, j);
            }
        }
        JButton restart = tablerito.getBtnReiniciar();
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.reset(casillas);
            }

        });
    }

    private void addEventClick(int i, int j) {
        JLabel cAct = casillas[i][j];
        cAct.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.ponerFicha(i, j, casillas);
            }

        });
    }

    private void puntajes() {
        JLabel p1 = tablerito.getLblPuntos1();
        JLabel p2 = tablerito.getLblPuntos2();
        model.setPuntajes(p1, p2);
    }

    
}
