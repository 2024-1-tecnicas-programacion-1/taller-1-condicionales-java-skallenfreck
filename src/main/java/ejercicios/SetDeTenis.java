package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {

    public static String evaluar(int numVictoriasA, int numVictoriasB) {

        if (numVictoriasA > 7 || numVictoriasB > 7) {
            return "Inválido";
        } else if ((numVictoriasA == 7 || numVictoriasB == 7) && (Math.abs(numVictoriasA - numVictoriasB) > 2) || Math.abs(numVictoriasA - numVictoriasB) == 0) {
            return "Inválido";
        } else if ((numVictoriasA == 6 || numVictoriasB == 6) && Math.abs(numVictoriasA - numVictoriasB) >= 2) {
            if (numVictoriasA - numVictoriasB > 0) {
                return "Ganó A";
            } else if (numVictoriasB - numVictoriasA > 0) {
                return "Ganó B";
            }
        } else if (numVictoriasA == 7 || numVictoriasB == 7) {
            if (numVictoriasA == 7) {
                return "Ganó A";
            } else if (numVictoriasB == 7) {
                return "Ganó B";
            }

        }
        return"Aún no termina";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();

        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
