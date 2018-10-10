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
public class ROMBO implements PARALELOGRAMO{
//-- atributos propios
    int diagonalMayor, diagonalMenor;
    
    
    //--atributos de la implementacion PARALELOGRAMA
    @Override
    public int calcularArea() {
        int result=0;
        result= (diagonalMayor*diagonalMenor)/2;
        return result;
    }

    @Override
    public int calcularPerimetro() {
        int result=0;
        result=diagonalMayor*4;
        return result;
    }
    //-- metodos propios de la clase
    public void ROMBO(){}
     public void setValores(int p_diagonalMayor, int p_diagonalMenor){
        this.diagonalMayor=p_diagonalMayor;
        this.diagonalMenor= p_diagonalMenor;
      
    }
     public int getDiagonalMayor(){
       return this.diagonalMayor;
    }
     public int getDiagonalMenor(){
       return this.diagonalMenor;
    }
}
