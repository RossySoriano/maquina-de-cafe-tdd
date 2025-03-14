public class MaquinaDeCafe {
    private Vaso vasos;
    private Cafetera cafetera;
    private Azucarero azucarero;

    public void setVasos(Vaso vasos) {
        this.vasos = vasos;
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }
    //Version Inicial del Metodo
    public String servirCafe(int cantidadCafe, int cantidadAzucar) {
        if (!vasos.hasVasos()) {
            return "No hay vasos";
        }
        if (!cafetera.hasCafe(cantidadCafe)) {
            return "No hay café";
        }
        if (!azucarero.hasAzucar(cantidadAzucar)) {
            return "No hay azúcar";
        }

        vasos.darVaso();
        cafetera.darCafe(cantidadCafe);
        azucarero.darAzucar(cantidadAzucar);
        return "Café servido con azúcar";
    }
}