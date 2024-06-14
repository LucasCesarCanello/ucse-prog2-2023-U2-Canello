import org.example.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionPrivadoTest {
    AvionPrivado avionPrivado;
    @Test
    public void testVolarCombustibleIgualA40000() {
        avionPrivado = new AvionPrivado(30000,5);
        Assertions.assertEquals(avionPrivado.volar(5000),40000);
    }
}