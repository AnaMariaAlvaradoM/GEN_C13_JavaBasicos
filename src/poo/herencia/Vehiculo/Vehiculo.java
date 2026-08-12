package poo.herencia.Vehiculo;

public class Vehiculo {
    protected String marca;
    protected int VelocidadMaxima;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.VelocidadMaxima = 0; // o algún valor predeterminado
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        VelocidadMaxima = velocidadMaxima;
    }

    public String describir() {
        return "Marca: " + marca + ", Velocidad Máxima: " + VelocidadMaxima + " km/h";
    }
}
