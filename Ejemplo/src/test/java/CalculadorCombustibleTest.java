import org.example.Avion;
import org.example.AvionPrivado;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadorCombustibleTest {
    @Test
    public void testCalcularCombustibleIgualA15000() {
        CalculadorCombustible method = CalculadorCombustible.getInstance();
        Avion avion = mock(Avion.class);
        when(avion.volar(5000)).thenReturn(15000);
        Assertions.assertEquals(method.calcularCombustible(avion,5000),15000);
    }
}