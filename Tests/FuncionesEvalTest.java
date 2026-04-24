import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionesEvalTest {

    @org.junit.jupiter.api.Test
    void esPerfecto() {
        assertThrows(ArithmeticException.class,() -> FuncionesEval.esPerfecto(-3));
        assertTrue(FuncionesEval.esPerfecto(6));
        assertFalse(FuncionesEval.esPerfecto(13));
    }

    @org.junit.jupiter.api.Test
    void getTipoClima() {
        assertEquals("FRIO", FuncionesEval.getTipoClima(10));
        assertEquals("NUBLADO", FuncionesEval.getTipoClima(20));
        assertEquals("CALUROSO", FuncionesEval.getTipoClima(30));
        assertEquals("TROPICAL",FuncionesEval.getTipoClima(40));
    }

    @org.junit.jupiter.api.Test
    void invertirArray() {
        assertThrows(IllegalArgumentException.class,() -> FuncionesEval.invertirArray(null));
        assertArrayEquals(new int[]{1,2},FuncionesEval.invertirArray(new int[] {2,1}));

    }

    @org.junit.jupiter.api.Test
    void encontrarMayor() {
    }

    @Test
    void contarApariciones() {
        assertEquals(2, FuncionesEval.contarApariciones(new int[]{1, 2, 3, 1, 4}, 1));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{5, 6, 7}, 2));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{}, 5));
    }
/*
    @Test
    void testEncontrarMayor() {
        int[] array1 = {1, 3, 2, 5, 4};
        assertEquals(5, FuncionesEval.encontrarMayor(array1));

        int[] array2 = {-1, -2, -3, -4};
        assertEquals(-1, FuncionesEval.encontrarMayor(array2));

        int[] array3 = {10};
        assertEquals(10, FuncionesEval.encontrarMayor(array3));

        int[] array4 = {};
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array4));

        int[] array5 = null;
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array5));
    }*/
}