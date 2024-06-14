import org.example.AvionComercial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionComercialTest {
    private AvionComercial avionComercial;

    @BeforeEach
    public void setup() {
        avionComercial = new AvionComercial(100, 10);
    }

    @Test
    public void volarCalcularCombustibleNecesarioCorrecto() {
        int result = avionComercial.volar(5);
        assertEquals(50, result);
    }

    @Test
    public void volarResultadoCeroCuandoDistanciaEsCero() {
        int result = avionComercial.volar(0);
        assertEquals(0, result);
    }

    @Test
    public void volarCalcularCombustibleNecesarioCorrectoCuandoConsumoEsUno() {
        avionComercial = new AvionComercial(100, 1);
        int result = avionComercial.volar(5);
        assertEquals(5, result);
    }

    @Test
    public void getCapacidadCombustibleCorrecto() {
        assertEquals(100, avionComercial.getCapacidadCombustible());
    }

    @Test
    public void getConsumoCombustibleCorrecto() {
        assertEquals(10, avionComercial.getConsumoCombustible());
    }
}
