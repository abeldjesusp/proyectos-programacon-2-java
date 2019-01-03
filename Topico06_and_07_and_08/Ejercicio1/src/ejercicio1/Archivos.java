
package ejercicio1;

import java.io.*;

public class Archivos {
    private static File archivo;
    
    public static void crearArchivo(){
        archivo = new File("ESTUDIANTES.txt");
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void guardarEstudiante(Estudiantes est){
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(est.getMatricula() + ", " + est.getNombre() + ", " + est.getApellido() + ", " + est.getCodigoCarrera());
            salida.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void leerEstudiantes(){
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
