import org.junit.Test;
import static org.junit.Assert.*;

public class TestVaso {
    @Test
    public void deberiaDevolverVerdaderoSiHayVasos() {
        Vaso vasos = new Vaso(10, 200); // 10 vasos de 200ml
        assertTrue(vasos.hasVasos());
    }

    @Test
    public void deberiaDevolverFalsoSiNoHayVasos() {
        Vaso vasos = new Vaso(0, 200); // 0 vasos
        assertFalse(vasos.hasVasos());
    }

    @Test
    public void deberiaRestarUnVasoAlDarUno() {
        Vaso vasos = new Vaso(5, 200); // 5 vasos
        vasos.darVaso();
        assertEquals(4, vasos.getCantidadVasos());
    }
}