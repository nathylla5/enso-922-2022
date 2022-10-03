package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicacaoTest {
    Multiplicacao multiplicacao;

    @BeforeEach
    public void beforeEach() {
        multiplicacao = new Multiplicacao();
    }

    
    @Test
    public void testeInteiro(){
        double resultado = multiplicacao.calculaMultiplicacao(5, 5);
        assertEquals(25, resultado);
    }

    @Test
    public void testeDecimal(){
        double resultado = multiplicacao.calculaMultiplicacao(5.5, 4.5);
        assertEquals(24.75, resultado);
    }
}