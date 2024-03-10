package test;

import ejercicios.Edad;
import ejercicios.SetDeTenis;
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
public class EdadTest {
    @Test
    public void test2000Enero1() {
        String valorEsperado = "Usted tiene 24 años";
        String valorActual = Edad.evaluar(1, 1, 2000);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2005Octubre24() {
        String valorEsperado = "Usted tiene 18 años";
        String valorActual = Edad.evaluar(24, 10, 2005);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test2009Mayo16() {
        String valorEsperado = "Usted tiene 14 años";
        String valorActual = Edad.evaluar(16, 5, 2009);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test1992Noviembre5() {
        String valorEsperado = "Usted tiene 31 años";
        String valorActual = Edad.evaluar(5, 11, 1992);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test1991Octubre29() {
        String valorEsperado = "Usted tiene 32 años";
        String valorActual = Edad.evaluar(29, 11, 1991);
        assertEquals(valorEsperado, valorActual);
    }
}
