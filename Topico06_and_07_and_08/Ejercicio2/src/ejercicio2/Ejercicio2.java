package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
       File archivo = new File("NUMEROS.txt");
       
       try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            int numero;
            lectura = entrada.readLine();
            while(lectura != null){
                numero = Integer.parseInt(lectura);
                if(numero % 2 == 0)
                    System.out.println("El numero " + numero + " es par");
                else
                    System.out.println("El numero " + numero + " es impar");
                lectura = entrada.readLine();
            }
            entrada.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
