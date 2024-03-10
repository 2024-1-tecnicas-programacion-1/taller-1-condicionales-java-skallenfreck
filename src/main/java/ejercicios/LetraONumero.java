
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        if(caracter>= (char)65&& caracter<=(char)90 || caracter==(char)165){
            return "Es letra mayúscula";
        }else if(caracter>=(char)97 && caracter<=(char)122 || caracter==(char)164){
            return "Es letra minúscula";        
        }else if(caracter>=(char)48 && caracter<=(char)57){
            return "Es número";
        }else{
            return "No es letra ni número";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
