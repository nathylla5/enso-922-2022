package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubtracaoTest {
    Subtracao subtracao;

    @BeforeEach
    public void beforeEach() {
        subtracao = new Subtracao();
    }

    
    @Test
    public void testeInteiro(){
        double resultado = subtracao.calculaSubtracao(10, 5);
        assertEquals(5, resultado);
    }

    @Test
    public void testeDecimal(){
        double resultado = subtracao.calculaSubtracao(15.5, 4);
        assertEquals(11.5, resultado);
    }
}
