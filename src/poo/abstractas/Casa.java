package poo.abstractas;

public class Casa implements Asegurable, Dibujable {
    private String direccion;
    private double valorInmueble;

    public Casa(String direccion, double valorInmueble) {
        this.direccion = direccion;
        this.valorInmueble = valorInmueble;
    }

    @Override
    public double calcularPrima() {
        return valorInmueble * 0.015;
    }

    @Override
    public String numeroPoliza() {
        return "POL-CASA-" + direccion.replace(" ", "");
    }


}