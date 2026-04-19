
public class Main {
    public static void main(String[] args) {

        CentroControl centro = new CentroControl();
        DronTransporte dron1 = new DronTransporte("DR-101");
        CamionAutonomo camion1 = new CamionAutonomo("CA-202");
        centro.registrarUnidad(dron1);
        centro.registrarUnidad(camion1);
        centro.monitorearFlota();
        dron1.sincronizarGPS();
    }
}