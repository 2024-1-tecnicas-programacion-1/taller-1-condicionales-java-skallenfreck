package test;

import ejercicios.LetraONumero;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class LetraONumeroTest {
    @Test
    public void testEsNumero() {
        String valorEsperado = "Es número";
        String valorActual = LetraONumero.evaluar('9');
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testEsNumero2() {
        String valorEsperado = "Es número";
        String valorActual = LetraONumero.evaluar('0');
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testEsNumero3() {
        String valorEsperado = "Es número";
        String valorActual = LetraONumero.evaluar('4');
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testEsletraMayuscula() {
        String valorEsperado = "Es letra mayúscula";
        String valorActual = LetraONumero.evaluar('C');
        assertEquals(valorEsperado, valorActual);
    }
    public void testEsletraMayuscula2() {
        String valorEsperado = "Es letra mayúscula";
        String valorActual = LetraONumero.evaluar('A');
        assertEquals(valorEsperado, valorActual);
    }
    public void testEsletraMayuscula3() {
        String valorEsperado = "Es letra mayúscula";
        String valorActual = LetraONumero.evaluar('Z');
        assertEquals(valorEsperado, valorActual);
    }
    public void testEsletraMinúscula() {
        String valorEsperado = "Es letra minúscula";
        String valorActual = LetraONumero.evaluar('c');
        assertEquals(valorEsperado, valorActual);
    }
     public void testEsletraMinúscula2() {
        String valorEsperado = "Es letra minúscula";
        String valorActual = LetraONumero.evaluar('f');
        assertEquals(valorEsperado, valorActual);
    }
      public void testEsletraMinúscula3() {
        String valorEsperado = "Es letra minúscula";
        String valorActual = LetraONumero.evaluar('o');
        assertEquals(valorEsperado, valorActual);
    }
}
