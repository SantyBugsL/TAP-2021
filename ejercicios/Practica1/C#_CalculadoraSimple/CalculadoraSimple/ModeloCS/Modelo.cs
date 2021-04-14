using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace CalculadoraSimple.ModeloCS
{
    class Modelo
    {
        //Abstraccion de atributos
        ArrayList operacionesMatematicas;
        string modeloMatematico;
        //Constructor
        public Modelo()
        {
            //Inicializacion de los atributos
            operacionesMatematicas = new ArrayList();
            modeloMatematico = "";
        }
        //Metodos de acceso
        public ArrayList OperacionesMatematicas
        {
            set{operacionesMatematicas = value;}

            get{return operacionesMatematicas;}
        }

        public string ModeloMatematico
        {
            set { modeloMatematico = value; }

            get { return modeloMatematico; }
        }
    }
}
