using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Microsoft.JScript.Vsa;
using Microsoft.JScript;
using CalculadoraSimple.ModeloCS;
using CalculadoraSimple.ControladorCS;
using System.Collections;

namespace CalculadoraSimple
{
    public partial class Calculadora : Form
    {
        //Declaracion de atributos
        Modelo m;
        Controlador ctrl;
        bool p;
        //Constructor
        public Calculadora()
        {
            //Inicializacion de los atributos
            InitializeComponent();
            m = new Modelo();
            ctrl = new Controlador();
            p = false;
        }
        //Metodos encargados de realizar una determinada accion al presionar un determinado boton
        private void btnUno_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas= new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "1";
        }

        private void btnDos_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "2";
        }

        private void btnTres_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "3";
        }

        private void btnCuatro_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "4";
        }

        private void btnCinco_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "5";
        }

        private void btnSeis_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "6";
        }

        private void btnSiete_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "7";
        }

        private void btnOcho_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "8";
        }

        private void btnNueve_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "9";
        }

        private void btnCero_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "0";
        }

        private void btnSuma_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "+";
        }

        private void btnResta_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "-";
        }

        private void btnMultiplicacion_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "*";
        }

        private void btnDivision_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "/";
        }

        private void btnExponencial_Click(object sender, EventArgs e)
        {
            //Condicional que evalua si el boton "="" ha sido presionado para limpiar el TextBox
            if (p)
            {
                txtEntradaSalida.Text = "";
                m.OperacionesMatematicas = new ArrayList();
                p = false;
            }

            txtEntradaSalida.Text = txtEntradaSalida.Text + "^";
        }

        private void btnIgual_Click(object sender, EventArgs e)
        {
            //try-catch para atrapar excepciones generadas durante la ejecucion del codigo
            try
            {
                /*Se "intenta" (ya que puede generar una excepcion) obtener el texto que se encuentra en el TextBox
				para asignarselo al modelo, realizar las operaciones indicadas en el TextBox y mostrar el resultado en el TextBox*/
                m.ModeloMatematico = txtEntradaSalida.Text;
                txtEntradaSalida.Text = ctrl.realizarOperacionesMatematicas(m);
                p = true;
            }
            catch
            {
                //En caso de que se haya generado una excepcion se imprime en el JTextField
                txtEntradaSalida.Text = "Error, has ingresado algo mal. Nota: La longitud máxima de dígitos de un número es de 20";
                p = true;
            }
        }
    }
}
