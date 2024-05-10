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

/**
 *
 * @author USUARIO
 */
public class Tablero_4x4 {
    private Tablero4x4 tableroN;
    private Modelo4x4 modeloN;
    private JLabel[][] casillas;

    public Tablero_4x4(Tablero4x4 tableroN, Modelo4x4 modeloN) {
        this.tableroN = tableroN;
        this.modeloN =  modeloN;
        casillas = tableroN.getCasillas();
        moreEvents();
        puntajes();
    }

    private void moreEvents() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                addEventClick(i, j);
            }
        }
        JButton restart = tableroN.getBtnReiniciar();
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloN.reset(casillas);
            }

        });
    }

    private void addEventClick(int i, int j) {
        JLabel cAct = casillas[i][j];
        cAct.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               modeloN.ponerFicha(i, j, casillas);
            }

        });
    }

    private void puntajes() {
        JLabel p1 = tableroN.getLblPuntos1();
        JLabel p2 = tableroN.getLblPuntos2();
       modeloN.setPuntajes(p1, p2);
    }

    
}
