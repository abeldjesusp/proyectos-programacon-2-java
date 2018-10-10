/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3y4.ejercicio.pkg3;
import java.util.Scanner;
import Clases.*;
/**
 *
 * @author Ezequiel
 */
public class Tema3y4Ejercicio3 {
public static void metodoRectangulo(){
        RECTANGULO objRec= new RECTANGULO();
      Scanner obj= new Scanner(System.in);
      int base=0;
        int altura=0;
 System.out.println("======================BIENVENIDO======================");
        System.out.println("RECTANGULO");
        System.out.println("Base:");
        base=obj.nextInt();
        System.out.println("Altura:");
         altura=obj.nextInt();
        objRec.setValores(base, altura);
        System.out.println("Area del RECTANGULO:"+objRec.calcularArea()); 
        System.out.println("Perimetro del RECTANGULO:"+objRec.calcularPerimetro()); 

}
public static void metodoCuadrado(){
      CUADRADO objCuadrado= new CUADRADO();
      Scanner obj= new Scanner(System.in);
      int lado=0;
      
        System.out.println("======================BIENVENIDO======================");
        System.out.println("CUADRADO");
        System.out.println("Lado:");
        lado=obj.nextInt();
       
        objCuadrado.setLado( lado);
        System.out.println("Area del CUADRADO:"+objCuadrado.calcularArea()); 
        System.out.println("Perimetro del CUADRADO:"+objCuadrado.calcularPerimetro()); 

}
public static void metodoRombo(){
      ROMBO objRombo= new ROMBO();
      Scanner obj= new Scanner(System.in);
      int ladoMayor=0;
        int ladoMenor=0;
      
        System.out.println("======================BIENVENIDO======================");
        System.out.println("ROMBO");
        System.out.println("Lado Mayor:");
        ladoMayor=obj.nextInt();
        System.out.println("Lado Menor:");
        ladoMenor=obj.nextInt();
        objRombo.setValores(ladoMayor,ladoMenor);
        System.out.println("Area del ROMBO:"+objRombo.calcularArea()); 
        System.out.println("Perimetro del ROMBO:"+objRombo.calcularPerimetro()); 

}
public static void metodoRomboide(){
      ROMBOIDE objRomboide= new ROMBOIDE();
      Scanner obj= new Scanner(System.in);
      int ladoA=0;
      int ladoB=0;
      int altura=0;
      
        System.out.println("======================BIENVENIDO======================");
        System.out.println("CUADRADO");
        System.out.println("Lado A:");
        ladoA=obj.nextInt();
        System.out.println("Lado B:");
        ladoB=obj.nextInt();
        System.out.println("Altura:");
        altura=obj.nextInt();
        objRomboide.setValores(ladoA,ladoB,altura);
        System.out.println("Area del ROMBOIDE:"+objRomboide.calcularArea()); 
        System.out.println("Perimetro del ROMBOIDE:"+objRomboide.calcularPerimetro()); 

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        metodoRectangulo();
        metodoCuadrado();
        metodoRombo();
        metodoRomboide();
  
    }
    
}
