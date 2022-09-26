package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdicaoTest {
    Soma soma;

    @BeforeEach
    public void beforeEach() {
        soma = new Soma();
    }

    
    @Test
    public void testeInteiro(){
        double resultado = soma.calculaSoma(5, 5);
        assertEquals(10, resultado);
    }

    @Test
    public void testeDecimal(){
        double resultado = soma.calculaSoma(5.5, 4.5);
        assertEquals(10, resultado);
    }
}
