public class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public boolean hasCafe(int cantidad) {
        return cantidadCafe >= cantidad;
    }

    public void darCafe(int cantidad) {
        if (hasCafe(cantidad)) {
            cantidadCafe -= cantidad;
        }
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }
}