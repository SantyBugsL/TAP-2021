package ejercicios.Proyecto;


import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        Laberinto lab = new Laberinto();
        
        ventana.setSize(new Dimension(940, 560));
        ventana.setTitle("Laberinto");
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(lab);
        ventana.setVisible(true);
    }
}
