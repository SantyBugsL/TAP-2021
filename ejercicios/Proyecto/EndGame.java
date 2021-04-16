package ejercicios.Proyecto;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EndGame extends JDialog{

    public EndGame(JFrame owner, boolean modal) {
        super(owner, modal);
        initComponets();
    }

    public void initComponets(){
        this.getContentPane().setLayout(new FlowLayout());

        //
        imgFondo = new JLabel();
        imgFondo.setIcon(new ImageIcon("recursos/GameOver.png"));
        imgFondo.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                imgFondoMouseClicked(e);
            }
        });

        add(imgFondo);

        // Perzonalizacion de la Ventana
        this.setSize(810, 400);
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        this.setOpacity(0.9f);
        this.setVisible(true);
    }

    public void imgFondoMouseClicked(MouseEvent e){
        System.out.println("Presionado");
        dispose();
        new StartGame(new JFrame(), false);
    }

    public static void main (String [] args){
        EndGame endGame = new EndGame(new JFrame(), true);
    }

    /// Variables declaration
    JLabel imgFondo;
    // End of variables declaration
    
}
