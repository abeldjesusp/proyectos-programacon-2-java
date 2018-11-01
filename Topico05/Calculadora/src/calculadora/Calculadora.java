package calculadora;

import interfaz.JFCalculadora;
import javax.swing.JFrame;

public class Calculadora {
   
    public static void main(String[] args) {
        JFCalculadora calculadora = new JFCalculadora();        
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
