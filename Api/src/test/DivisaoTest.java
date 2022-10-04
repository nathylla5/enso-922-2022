package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisaoTest {
    Divisao divisao;

    @BeforeEach
    public void beforeEach() {
        divisao = new Divisao();
    }

    
    @Test
    public void testeInteiro(){
        double resultado = divisao.calculaDivisao(5, 5);
        assertEquals(1, resultado);
    }

    @Test
    public void testeDecimal(){
        double resultado = divisao.calculaDivisao(5.5, 4.5);
        assertEquals(1.2222222222222223, resultado);
    }
}