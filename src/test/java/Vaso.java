public class Vaso {
    private int cantidadVasos;
    private int capacidad;

    public Vaso(int cantidadVasos, int capacidad) {
        this.cantidadVasos = cantidadVasos;
        this.capacidad = capacidad;
    }

    public boolean hasVasos() {
        return cantidadVasos > 0;
    }

    public void darVaso() {
        if (hasVasos()) {
            cantidadVasos--;
        }
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }
}