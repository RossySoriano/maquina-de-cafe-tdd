import org.junit.Test;
import static org.junit.Assert.*;

public class TestAzucarero {
    @Test
    public void deberiaDevolverVerdaderoSiHayAzucar() {
        Azucarero azucarero = new Azucarero(10); // 10 cucharadas
        assertTrue(azucarero.hasAzucar(2)); // ¿Hay 2 cucharadas?
    }

    @Test
    public void deberiaDevolverFalsoSiNoHaySuficienteAzucar() {
        Azucarero azucarero = new Azucarero(1); // 1 cucharada
        assertFalse(azucarero.hasAzucar(2)); // ¿Hay 2 cucharadas?
    }

    @Test
    public void deberiaRestarAzucarAlDar() {
        Azucarero azucarero = new Azucarero(5); // 5 cucharadas
        azucarero.darAzucar(3); // Dar 3 cucharadas
        assertEquals(2, azucarero.getCantidadAzucar());
    }
}