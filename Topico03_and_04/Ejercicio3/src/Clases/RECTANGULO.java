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
public class RECTANGULO implements PARALELOGRAMO {
//-- ATRIBUTOS PROPIOS DE LA CLASE
    int base=0;
    int altura=0;
    
    
//-- METODOS DE LA INTERFACE SOBRESCRITOS    
    @Override
    public int calcularArea() {
        int result =0;// area = base*altura
        result= base*altura;
        return result;
    }
    public void RECTANGULO(){}

    @Override
    public int calcularPerimetro() {
       int result=0;// perimetro= 2(lado1+lado2)
       result=2*(base+altura);
       return result;
    }
//-- METODOS DE LA CLASE
    public void setValores(int p_base, int p_altura){
        this.base=p_base;
        this.altura=p_altura;
    }
     public int getBase(){
       return this.base;
    }
      public int getAltura(){
       return this.altura;
    }
    
}
