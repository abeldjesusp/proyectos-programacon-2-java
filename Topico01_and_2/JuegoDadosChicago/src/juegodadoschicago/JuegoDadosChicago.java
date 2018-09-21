package juegodadoschicago;

import java.util.Scanner;

public class JuegoDadosChicago {

    public static void main(String[] args) {        
        int puntajeJugador01 = 0;        
        int puntajeJugador02 = 0;
        int dado1 = 0, dado2 = 0;
        int clave = 2;
        
        
        int vueltas = 1;
        
        while(vueltas != 12){
            System.out.println("***************");
            System.out.println("Vuelta " + vueltas);
            System.out.println("***************");

            System.out.println("\nTurno Jugador 1");          
            puntajeJugador01 += turnoJugador(dado1,dado2,clave);            
            
            System.out.println("\nTurno Jugador 2");
            puntajeJugador02 += turnoJugador(dado1,dado2,clave);
            
            clave++;
            vueltas++;
        }
        
        if(puntajeJugador01 > puntajeJugador02){
            System.out.println("\nGano el jugador 1");
            System.out.println("**********************");
            System.out.println("Jugador 1 : " + puntajeJugador01 + " puntos");
            System.out.println("Jugador 2 : " + puntajeJugador02 + " puntos");
        }else if(puntajeJugador01 == puntajeJugador02){
            System.out.println("\nHubo un empate");
            System.out.println("**********************");
            System.out.println("Puntuación : " + puntajeJugador01 + " puntos");
        }else{
            System.out.println("\nGano el jugador 2");
            System.out.println("**********************");
            System.out.println("Jugador 1 : " + puntajeJugador01 + " puntos");
            System.out.println("Jugador 2 : " + puntajeJugador02 + " puntos");
        }

    }
    
    public static int tirarDado(){        
        return (int) (Math.random() * 6) + 1;
    }
    
    public static int calcularPuntaje(int dado1, int dado2, int clave){
        int puntaje = 0;
        int tmpPuntaje = dado1 + dado2;
        
        if(dado1 == clave)
            puntaje = clave;
        else if(dado2 == clave)
            puntaje = clave;
        else if(tmpPuntaje == clave)
            puntaje = clave;
        else
            puntaje = 0;
        
        return puntaje;
    }
    
    public static int turnoJugador(int dado1, int dado2, int clave){        
        Scanner scan = new Scanner(System.in);
        System.out.println("Pulse enter para tirar");
        scan.nextLine();
        dado1 = tirarDado();
        dado2 = tirarDado();
        System.out.println("Resultados");
        System.out.println("Dato 1 : " + dado1);
        System.out.println("Dato 2 : " + dado2);
        
        return calcularPuntaje(dado1,dado2,clave);
    }
    
}
