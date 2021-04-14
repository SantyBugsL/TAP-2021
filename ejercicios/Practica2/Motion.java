package ejercicios.Practica2;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;


public class Motion extends JFrame implements MouseMotionListener
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JPanel p;
    Boton b;
    Caja c;
    Controlador ctrl;
    
    public Motion(){
        p = new JPanel();
        b = new Boton();
        c = new Caja();
        ctrl = new Controlador();
        
        p.add(ctrl.getCaja(c, 10, 10, 128, 128, ctrl.getBoton(b)));
        
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        
        setSize(300, 300);
        setVisible(true);
        
        c.paint(p.getGraphics());
        c.addMouseMotionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b)
        {
            System.out.println("Funciona");
        }
    }
    public static void main(String[] args)
    {
        Motion m = new Motion();
        m.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
        c.setX(e.getX());
        c.setY(e.getY());
        c.repaint();
    }
}
class Controlador{
    public Caja getCaja(Caja c, int x, int y, int l, int a, Boton b)
    {
        c.setX(x);
        c.setY(y);
        c.setAncho(a);
        c.setLargo(l);
        c.setImageIcon(b.getImage());
        return c;
    }
    public Boton getBoton(Boton b)
    {
        b.setImage("C:\\Users\\santy\\Downloads\\GitHub\\TAP-2021\\recursos\\PajaroL.png");
        return b;
    }
}
class Boton
{
    ImageIcon i;
    
    public Boton()
    {
        i=new ImageIcon("");
    }
    public void setImage(String im)
    {
        i = new ImageIcon(im);
    }
    public ImageIcon getImage()
    {
        return i;
    }
}
class Caja extends Canvas
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    int x;
    int y;
    int largo;
    int ancho;
    ImageIcon image;
    
    public Caja()
    {
        x=0;
        y=0;
        largo=0;
        ancho=0;
        setSize(300, 300);
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public void setLargo(int l)
    {
        largo = l;
    }
    public void setAncho(int a)
    {
        ancho = a;
    }
    public void setImageIcon(ImageIcon i)
    {
        image = i;
    }
    public ImageIcon getImageIcon()
    {
        return image;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getLargo()
    {
        return largo;
    }
    public int getAncho()
    {
        return ancho;
    }
    public void paint(Graphics g)
    {
        g.drawImage(getImageIcon().getImage(), getX(), getY(), getAncho(), getLargo(), null);
        g.drawString("x", 140, 140);
    }
}
