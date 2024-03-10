package test;

import ejercicios.Ordenamiento;
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
public class OrdenamientoTest {
    @Test
    public void testNo() {
        String valorEsperado = "0, 1, 6, 7";
        String valorActual = Ordenamiento.evaluar(7, 0, 6, 1);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testNo1() {
        String valorEsperado = "1, 1, 9, 9";
        String valorActual = Ordenamiento.evaluar(9, 9, 1, 1);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testNo2() {
        String valorEsperado = "0, 0, 0, 0";
        String valorActual = Ordenamiento.evaluar(0, 0, 0, 0);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testNo3() {
        String valorEsperado = "-2, 0, 55, 75";
        String valorActual = Ordenamiento.evaluar(0, 55, 75, -2);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testNo4() {
        String valorEsperado = "-3, -2, -1, 0";
        String valorActual = Ordenamiento.evaluar(0, -1, -2, -3);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testNo5() {
        String valorEsperado = "25, 38, 57, 90";
        String valorActual = Ordenamiento.evaluar(25, 90, 57, 38);
        assertEquals(valorEsperado, valorActual);
    }
}
