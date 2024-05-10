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

public class Tablero_5x5 {

    private Tablero5x5 tablerote;
    private Modelo5x5 modelote;
    private JLabel[][] casillas;

    public Tablero_5x5(Tablero5x5 tablerote, Modelo5x5 modelote) {
        this.tablerote = tablerote;
        this.modelote = modelote;
        casillas = tablerote.getCasillas();
        moreEvents();
        puntajes();
    }

    private void moreEvents() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                addEventClick(i, j);
            }
        }
        JButton restart = tablerote.getBtnReiniciar();
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelote.reset(casillas);
            }

        });
    }

    private void addEventClick(int i, int j) {
        JLabel cAct = casillas[i][j];
        cAct.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               modelote.ponerFicha(i, j, casillas);
            }

        });
    }

    private void puntajes() {
        JLabel p1 = tablerote.getLblPuntos1();
        JLabel p2 = tablerote.getLblPuntos2();
       modelote.setPuntajes(p1, p2);
    }

    
}