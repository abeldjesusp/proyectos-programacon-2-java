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
public class ROMBOIDE implements PARALELOGRAMO{
//-- atributos de la clase
    int ladoa,ladob,altura=0;
    //-- metodos de la implementacion
    @Override
    public int calcularArea() {
    int result=0;        //- area = base* altura;
    result= ladob*altura;       
        return result;
    }

    @Override
    public int calcularPerimetro() {
        int result =0;
        result= 2*(ladoa+ladob);
        return result;
    }
    //-- metodos propios de la clase
    public void ROMBOIDE(){}
      public void setValores(int p_ladoA, int p_ladoB, int p_altura){
        this.ladoa=p_ladoA;
        this.ladob= p_ladoB;
        this.altura=p_altura;
    }
     public int getLadoA(){
       return this.ladoa;
    }
     public int getLadoB(){
       return this.ladob;
    }
      public int getAltura(){
       return this.altura;
    }
    
}
