package app;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.jooby.Jooby;

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
