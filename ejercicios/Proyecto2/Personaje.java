package ejercicios.Proyecto2;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class Personaje extends JPanel{
    
    private final int movimiento = 40;
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Image personaje = new ImageIcon(getClass().getResource("/recursos/cone/zanahoria2.gif")).getImage();
        g.drawImage(personaje, 0, 40, 60, 60, null);
  
    }
}
