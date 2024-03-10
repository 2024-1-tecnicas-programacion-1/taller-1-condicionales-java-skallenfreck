package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {

    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        int[] ordenInicial = {numero1, numero2, numero3, numero4};
        for (int i = 0; i < ordenInicial.length; i++) {
            for (int j = i + 1; j < ordenInicial.length; j++) {
                if (ordenInicial[i] > ordenInicial[j]) {
                    int a = ordenInicial[i];
                    int b = ordenInicial[j];
                    ordenInicial[i]= b;
                    ordenInicial[j]= a;
                }
            }

        }
        String resultado = Arrays.toString(ordenInicial);
        resultado = resultado.substring(1, resultado.length() - 1);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();

        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
