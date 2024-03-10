package test;

import ejercicios.Division;
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
public class DivisionTest {
    @Test
    public void testDivisionExacta() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 4";
        String valorActual = Division.evaluar(14, 5);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testDivisionExacta2() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 10\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(100, 10);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testDivisionExacta3() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(80, 40);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testDivisionExacta4() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 3\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(27, 9);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testDivisionExacta5() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 3\n"
                + "Residuo: 1";
        String valorActual = Division.evaluar(10, 3);
        assertEquals(valorEsperado, valorActual);
    }
      @Test
    public void testDivisionExacta6() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 22\n"
                + "Residuo: 2";
        String valorActual = Division.evaluar(90, 4);
        assertEquals(valorEsperado, valorActual);
    }
}
