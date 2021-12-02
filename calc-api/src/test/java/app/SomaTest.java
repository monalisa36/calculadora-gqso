package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class SomaTest {
    Soma soma;

    @BeforeEach
    public void setup() {
        soma = new Soma();
    }

    @Test
    public void testSomaSuccess() {
        assertEquals(6, soma.soma("3", "3"));
    }

    @Test
    public void testSomaString(){
        assertThrows(IllegalArgumentException.class, ()->{
            soma.soma("a","n");
        });
    }

    @Test
    public void testSomaNulo(){
        assertThrows(IllegalArgumentException.class, ()->{
            soma.soma("null","null");
        });
    }
}