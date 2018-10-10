package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ezequiel
 */
public class CUADRADO implements PARALELOGRAMO {
//-- ATRIBUTOS PROPIOS DE LA CLASE
    int lado=0;
    
    
    //-- METODOS POR DE LA INTERFACE SOBREESCRITOS
    @Override
    public int calcularArea() {
        int result=0;//-- a= l^2;
        result=(lado*lado);
        return result;
    }

    @Override
    public int calcularPerimetro() {
         int result=0;//-- p= s1*4;
        result=lado*4;
        return result;
    }
    //-- METODOS PROPIOS
    public void CUADRADO(){}
      public void setLado(int p_lado){
        this.lado=p_lado;  
    }
     public int getLado(){
       return this.lado;
    }
}
