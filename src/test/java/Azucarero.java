public class Azucarero {
    private int cantidadAzucar;

    public Azucarero(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public boolean hasAzucar(int cantidad) {
        return cantidadAzucar >= cantidad;
    }

    public void darAzucar(int cantidad) {
        if (hasAzucar(cantidad)) {
            cantidadAzucar -= cantidad;
        }
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }
}
