class DronTransporte extends Vehiculo implements IConectable {

    public DronTransporte(String id) {
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Dron " + getId() + " se desplaza volando");
    }

    @Override
    public void sincronizarGPS() {
        System.out.println("Dron " + getId() + " sincronizando gps satelital");
    }
}