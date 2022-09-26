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
    public void TESTE1(){
        double resultado = soma.calculaSoma(5, 5);
        assertEquals(10, resultado);
    }
}
