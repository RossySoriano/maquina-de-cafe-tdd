import org.junit.Test;
import static org.junit.Assert.*;

public class TestMaquinaDeCafe {
    @Test
    public void deberiaServirCafeConAzucarSiHayRecursos() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setVasos(new Vaso(1, 200)); // 1 vaso de 200ml
        maquina.setCafetera(new Cafetera(500)); // 500ml de café
        maquina.setAzucarero(new Azucarero(10)); // 10 cucharadas
        String resultado = maquina.servirCafe(200, 2); // 200ml de café, 2 cucharadas
        assertEquals("Café servido con azúcar", resultado);
    }

    @Test
    public void deberiaFallarSiNoHayVasos() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setVasos(new Vaso(0, 200)); // 0 vasos
        maquina.setCafetera(new Cafetera(500));
        maquina.setAzucarero(new Azucarero(10));
        String resultado = maquina.servirCafe(200, 2);
        assertEquals("No hay vasos", resultado);
    }
}