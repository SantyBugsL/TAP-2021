package ejercicios.Proyecto;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StartGame extends JDialog {

    public StartGame(JFrame frame, boolean modal) {
        super(frame, modal);
        initComponets();
    }

    public void initComponets() {
        this.getContentPane().setLayout(new FlowLayout());

        //
        imgFondo = new JLabel();
        imgFondo.setIcon(new ImageIcon(getClass().getResource("/recursos/cone/Laberinto.png")));
        imgFondo.addMouseListener(new MouseAdapter() {
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

    public void imgFondoMouseClicked(MouseEvent e) {
        this.dispose();
        new MainGame().initComponents();
    }
    
    /// Variables declaration
    JLabel imgFondo;
    // End of variables declaration

}
