package ejercicios.BlocNotas;


import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Bloc extends Frame implements ActionListener {
    // Variables
    TextArea txt_out;
    Panel panel_superior, panel_central;
    JButton btnColor, btnTamanio, btnGuardar, btnAbrir, btnSalir, btnComillas;
    File archivo;
    JLabel txt_esta;
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Bloc() {
        initComponents();
    }

    public void initComponents() {

        this.setLayout(new BorderLayout());

        btnColor = new JButton("Color");
        btnColor.addActionListener(this);

        btnTamanio = new JButton("Tamaño");
        btnTamanio.addActionListener(this);

        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this);

        btnAbrir = new JButton("Abrir");
        btnAbrir.addActionListener(this);

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);

        btnComillas = new JButton("Comillas");
        btnComillas.addActionListener(this);

        txt_out = new TextArea();
        txt_out.setFont(new Font(null, 1, 12));

        panel_superior = new Panel();
        panel_superior.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel_superior.add(btnColor);
        panel_superior.add(btnTamanio);
        panel_superior.add(btnGuardar);
        panel_superior.add(btnAbrir);
        panel_superior.add(btnSalir);
        panel_superior.add(btnComillas);

        panel_central = new Panel();
        panel_central.setLayout(new BorderLayout());
        panel_central.add(txt_out, BorderLayout.CENTER);

        this.add(panel_central, BorderLayout.CENTER);
        this.add(panel_superior, BorderLayout.NORTH);

        // Preferencia en la Ventana
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //
        if (e.getSource() == btnColor) {
            try {
                int c = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Elija su Color Segun La Lista \n" + "0 - Negro\n" + "1 - Naaranja\n" + "2 - Purpura\n" + "3 - Rojo\n"
                                + "4 - Rosa\n" + "5 - Verde\n" + "6 - Gris\n"));
                cambiarColor(c);
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        if (e.getSource() == btnTamanio) {
            int t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tamaño de Texto"));
            txt_out.setFont(new Font(null, 1, t));
        }
        if (e.getSource() == btnSalir) {
            System.exit(0);
        }
        if (e.getSource() == btnComillas) {
            String texto, select;
            texto = txt_out.getText();
            select = txt_out.getSelectedText();
            txt_out.setText(texto.split(select)[0] + "'" + select + "'" + texto.split(select)[1]);
        }
    }

    public void cambiarColor(int c) {
        switch (c) {
        case 0:
            txt_out.setForeground(Color.BLACK);
            break;
        case 1:
            txt_out.setForeground(Color.orange);
            break;
        case 2:
            txt_out.setForeground(Color.magenta);
            break;
        case 3:
            txt_out.setForeground(Color.RED);
            break;
        case 4:
            txt_out.setForeground(Color.BLUE);
            break;
        case 5:
            txt_out.setForeground(Color.GREEN);
            break;
        case 6:
            txt_out.setForeground(Color.lightGray);
            break;
        default:
            txt_out.setForeground(Color.BLACK);
            break;
        }
    }

    public static void main(String args[]) {
        Bloc v = new Bloc();
        v.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}