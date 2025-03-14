import org.junit.Test;
import static org.junit.Assert.*;

public class TestCafetera {
    @Test
    public void deberiaDevolverVerdaderoSiHayCafe() {
        Cafetera cafetera = new Cafetera(1000); // 1000ml de café
        assertTrue(cafetera.hasCafe(200)); // ¿Hay 200ml?
    }

    @Test
    public void deberiaDevolverFalsoSiNoHaySuficienteCafe() {
        Cafetera cafetera = new Cafetera(100); // 100ml de café
        assertFalse(cafetera.hasCafe(200)); // ¿Hay 200ml?
    }

    @Test
    public void deberiaRestarCafeAlServir() {
        Cafetera cafetera = new Cafetera(500); // 500ml
        cafetera.darCafe(200); // Servir 200ml
        assertEquals(300, cafetera.getCantidadCafe());
    }
}