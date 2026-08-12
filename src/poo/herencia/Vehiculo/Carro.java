package poo.herencia.Vehiculo;

public class Carro extends Vehiculo {
    private int puertas;
    public Carro(String marca, int puertas) {
        super(marca);
        this.puertas = puertas;
    }
    public int getPuertas() { return this.puertas; }
    @Override
    public String describir() {
        return super.describir() + " | Automóvil de " + this.puertas + " puertas";
    }
}
