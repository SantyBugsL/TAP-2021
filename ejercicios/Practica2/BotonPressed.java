package ejercicios.Practica2;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.*; 

public class BotonPressed extends JFrame implements KeyListener
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton btn;
    char t;
    public BotonPressed()
    {
        btn = new JButton("");
        btn.setIcon(new ImageIcon("PajaroL.png"));
        
        setLayout(new BorderLayout());
        add(btn, BorderLayout.CENTER);
        
        setSize(300, 150);
        setVisible(true);
        
        
        
        btn.addKeyListener(this);
    }
    public static void main(String[] args)
    {
        BotonPressed bp = new BotonPressed();
        bp.setVisible(true);
    }
    public void keyTyped(KeyEvent e) 
    { 
    } 
    public void keyReleased(KeyEvent e) 
    { 
    } 
    public void keyPressed(KeyEvent e) 
    {
        btn.setText(e.getKeyChar()+"");
        System.out.println(e.getKeyChar());
    } 
    public void setKeyTecla(JButton btn)
    {
    }
}