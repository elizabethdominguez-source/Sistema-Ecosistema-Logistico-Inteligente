import java.util.ArrayList;

class CentroControl {
    private ArrayList<Vehiculo> flota;

    public CentroControl() {
        flota = new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v) {
        flota.add(v);
    }

    public void monitorearFlota() {
        for (Vehiculo v : flota) {
            v.patronMovimiento();
        }
    }
}