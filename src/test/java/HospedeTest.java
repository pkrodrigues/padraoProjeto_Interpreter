import deignpattern.behavioral.Hospede;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospedeTest {
    @Test
    void deveCalcularExpressaoFormula()
    {
        Hospede hospede = new Hospede();
        hospede.setQuantidadesDias(8);
        hospede.setValorDiaria(63.8);
        hospede.setCupomDesconto(50);

        assertEquals(460.40,hospede.calcularHospedagem());
    }
}
