/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Modelo4x4 {
private boolean fin;
    private boolean emp;
    private String[][] tableroLog;
    private String turno;
    private JLabel pCube1;
    private JLabel pCube2;
    private int movimientos;
    private int puntos1;
    private int puntos2;

    public String getTurno() {
        return turno;
    }

    public Modelo4x4() {
        turno = "X";
        fin = false;
        emp = false;
        tableroLog = new String[4][4];
        movimientos = 0;
        puntos1 = 0;
        puntos2 = 0;
    }

    public void ponerFicha(int i, int j, JLabel[][] casillas) {
        if (!fin) {
            if (tableroLog[i][j] == null) {
                tableroLog[i][j] = turno;
                casillas[i][j].setText(turno);
                movimientos++;
                estado(casillas);
                if (!fin) {
                    turno = (turno.equals("X")) ? "O" : "X";
                } else {
                    gameOver();
                }
            }
        }
    }

    private void Filas() {
        for (int i = 0; i < 4 && !fin; i++) {
            boolean victoria = true;
            for (int j = 0; j < 4 && victoria; j++) {
                if (tableroLog[i][j] == null || !tableroLog[i][j].equals(turno)) {
                    victoria = false;
                }
            }
            if (victoria) {
                fin = true;
            }
        }
    }

    private void columnas() {
        for (int j = 0; j < 4 && !fin; j++) {
            boolean victoria = true;
            for (int i = 0; i < 4 && victoria; i++) {
                if (tableroLog[i][j] == null || !tableroLog[i][j].equals(turno)) {
                    victoria = false;
                }
            }
            if (victoria) {
                fin = true;
            }
        }
    }

    private void diagonalD() {
        boolean victoria = true;
        for (int i = 0; i < 4 && !fin; i++) {
            if (tableroLog[i][i] == null || !tableroLog[i][i].equals(turno)) {
                victoria = false;
            }
        }
        if (victoria) {
            this.fin = true;
        }
    }

    private void diagonalI() {
        boolean victoria = true;
        int j = 3;
        for (int i = 0; i < 4 && !fin; i++, j--) {
            if (tableroLog[i][j] == null || !tableroLog[i][j].equals(turno)) {
                victoria = false;
            }
        }
        if (victoria) {
            fin = true;
        }
    }

    private void estado(JLabel[][] casillas) {
        Filas();
        if (!fin) {
            columnas();
            if (!fin) {
                diagonalD();
                if (!fin) {
                    diagonalI();
                    if (!fin && movimientos == 16) {
                        emp = true;
                        fin = true;
                        Empate(casillas);
                    }
                }
            }
        }
    }

    void setPuntajes(JLabel p1, JLabel p2) {
        pCube1 = p1;
        pCube2 = p2;
    }

    void reset(JLabel[][] casillas) {
        turno = "X";
        fin = false;
        emp = false;
        movimientos = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tableroLog[i][j] = null;
                casillas[i][j].setText("");
            }
        }
    }

    private void gameOver() {
        if (turno.equals("X")) {
            puntos1++;
            pCube1.setText(String.valueOf(puntos1));
        } else {
            puntos2++;
            pCube2.setText(String.valueOf(puntos2));
        }
    }

    private void Empate(JLabel[][] casillas) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tableroLog[i][j] = null;
                casillas[i][j].setText("");
            }
        }
        turno = "X";
        movimientos = 0;
        emp = false;
        fin = false;
    }

}
