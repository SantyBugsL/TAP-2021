using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
using CalculadoraSimple.ModeloCS;
using Microsoft.JScript.Vsa;
using Microsoft.JScript;


namespace CalculadoraSimple.ControladorCS
{
    class Controlador
    {
        //Metodo que llama a los metodos separarOperacionesMatematicas y este a acomodarOperacionesMatematicas para resolver la operacion
        public string realizarOperacionesMatematicas(Modelo md)
        {
            VsaEngine engine = VsaEngine.CreateEngine();
            object o = Eval.JScriptEvaluate(separarOperacionesMatematicas(md).ToString(), engine);
            return System.Convert.ToDouble(o).ToString();
        }
        /*Metodo que obtiene la resolucion de las exponenciales para tomarlas como un valor = al resultado
          Ej.: 2 + (3 ^ 0) lo convierte a 2 + (1) devuelve el 2 + 1 como un String para ser evaluado por ScriptEngineManager*/
        public string acomodarOperacionesMatematicas(ArrayList v)
        {
            int n = 0;
            int fnl = 0;
            fnl = v.Count-1;
            double b;
            while (n != fnl)
            {
                if (v[n].Equals("^"))
                {
                    b = Math.Pow(System.Convert.ToDouble(v[n - 1]), System.Convert.ToDouble(v[n + 1]));
                    v.Insert(n - 1, b + "");
                    v.RemoveAt(n + 2);
                    v.RemoveAt(n + 1);
                    v.RemoveAt(n);
                    n = n - 1;
                    fnl = v.Count - 1;
                }
                else
                    n = n + 1;
            }

            String c = "";

            foreach (string caracter in v)
            {
                c = c + caracter;
            }
            return c;
        }
        /*Metodo encargado de separar el String de las operaciones matematicas en un Vector en el que cada
	      numero y operador aritmetico estan en posiciones distintas, luego de haber realizado eso retorna una llamda
    	  al metodo acomodarOperacionesMatematicas que a su vez devuelve el String resultado de haber realizado las
          potencias encontradas*/
        public string separarOperacionesMatematicas(Modelo mm)
	    {
		    string om = mm.ModeloMatematico;
    		ArrayList op = mm.OperacionesMatematicas;
	    	string numero = "";

    		for(int i=0;i<om.Length;i++)
	    	{
		    	if(Char.IsNumber(om[i]))
			    {
			    	numero = numero + Char.ToString(om[i]);
				    if(i==om.Length-1)
    				{   
	    				if(numero.Length>20)
		    				throw new Exception("Algun valor esta fuera del rango de 20 digitos");
			    		else
				    		op.Add(numero);
    				}   
	    		}
		    	else
			    {
                    if(i==0)
                        numero = numero + Char.ToString(om[i]);
                    else
                    {
    				    if(numero != "")
	    			    {
		    		    	if(numero.Length>20)
			    	    		throw new Exception("Algun valor esta fuera del rango de 20 digitos");
				        	else
					        {
						        op.Add(numero);
		    				    numero = "";
    			    		}
	    			    }
                            
    	    			if( (!Char.IsNumber(om[i]) && !Char.IsNumber(om[i-1]) ) && (om[i] == '+' || om[i] == '-') )
	    	    		{
		    	    		numero = numero + Char.ToString(om[i]);
			    	    }
	    		    	else
		    		    {
			    		    op.Add(Char.ToString(om[i]));
    				    }
	    		    }
                }
		    }

		    mm.OperacionesMatematicas = op;
	    	return acomodarOperacionesMatematicas(mm.OperacionesMatematicas);
	    }


    }
}
