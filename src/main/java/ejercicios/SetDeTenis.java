package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {

    public static String evaluar(int numVictoriasA, int numVictoriasB) {

        if (numVictoriasA < 7 && numVictoriasB < 7 && Math.abs(numVictoriasA - numVictoriasB) < 2) {
            return "Aún no termina";
        } else if (numVictoriasA == 7 && numVictoriasB == 0) {
            return "Ganó A";

        } else if (numVictoriasA == 0 && numVictoriasB == 7) {
            return "Ganó B";
        } else if ((numVictoriasB <= numVictoriasA - 2) && (numVictoriasA > numVictoriasB) && (numVictoriasA <= 6)) {
            return "Ganó A";
        } else if ((numVictoriasA <= numVictoriasB - 2) && (numVictoriasB > numVictoriasA) && (numVictoriasB <= 6)) {
            return "Ganó B";
        } else if ((5 <= numVictoriasA) && (numVictoriasA <= 7) && (5 <= numVictoriasB) && (numVictoriasB <= 7)) {
            if ((numVictoriasA - 1 > numVictoriasB)) {
                return "Ganó A";
            } else if (numVictoriasB - 1 > numVictoriasA) {
                return "Ganó B";
            }
        } else if (((numVictoriasA >= 7) && (numVictoriasB < 7)) || ((numVictoriasB >= 7) && (numVictoriasA < 7))) {
            return "Inválido";

        }
        return "";
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
