/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Jugador {
    private Inicio inicio;
    private Color color;
    private String opcion;

    public Jugador() {

    }

    public Jugador(Color color, String opcion) {
        this.color = color;
        this.opcion = opcion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public Color cambiarColor(int i, int j, JLabel[][] casillas) {
        Color ColorTexto = getColor();
        switch (this.opcion) {
            case "Rojo" ->
                ColorTexto = Color.RED;

            case "Azul" ->
                ColorTexto = Color.BLUE;

            case "Morado" ->
                ColorTexto = new Color(128, 0, 128);

            case "Verde" ->
                ColorTexto = Color.GREEN;

            case "Rosado" ->
                ColorTexto = Color.PINK;

            case "Naranja" ->
                ColorTexto = Color.ORANGE;

            case "Vino" ->
                ColorTexto = new Color(128, 0, 0);

            case "Negro" ->
                ColorTexto = Color.BLACK;
        }
        casillas[i][j].setForeground(ColorTexto);
        return ColorTexto;
    }

}
