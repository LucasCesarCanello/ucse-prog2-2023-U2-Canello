import org.example.AvionPrivado;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionPrivadoTest {
    private AvionPrivado avionPrivado;

    @BeforeEach
    public void setup() {
        avionPrivado = new AvionPrivado(100, 10);
    }

    @Test
    public void volarCalculaCombustibleNecesarioCorrectamente() {
        int resultado = avionPrivado.volar(5);
        assertEquals(50, resultado);
    }

    @Test
    public void volarDevuelveCeroCuandoDistanciaEsCero() {
        int resultado = avionPrivado.volar(0);
        assertEquals(0, resultado);
    }

    @Test
    public void volarCalculaCombustibleNecesarioCorrectamenteCuandoConsumoEsUno() {
        avionPrivado = new AvionPrivado(100, 1);
        int resultado = avionPrivado.volar(5);
        assertEquals(5, resultado);
    }

    @Test
    public void getCapacidadCombustibleDevuelveValorCorrecto() {
        assertEquals(100, avionPrivado.getCapacidadCombustible());
    }

    @Test
    public void getConsumoCombustibleDevuelveValorCorrecto() {
        assertEquals(10, avionPrivado.getConsumoCombustible());
    }
}