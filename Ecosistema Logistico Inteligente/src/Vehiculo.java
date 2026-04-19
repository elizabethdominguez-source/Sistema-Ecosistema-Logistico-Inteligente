import java.util.ArrayList;

abstract class Vehiculo {
    private String id;

    public Vehiculo(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public abstract void patronMovimiento();
}

interface IConectable {
    void sincronizarGPS();
}

class DronTransporte extends Vehiculo implements IConectable {

    public DronTransporte(String id) {
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Dron " + getId() + " se desplaza volando.");
    }

    @Override
    public void sincronizarGPS() {
        System.out.println("Dron " + getId() + " sincronizando GPS satelital.");
    }
}

class CamionAutonomo extends Vehiculo {

    public CamionAutonomo(String id) {
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Camion " + getId() + " se desplaza por carretera automaticamente.");
    }
}

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