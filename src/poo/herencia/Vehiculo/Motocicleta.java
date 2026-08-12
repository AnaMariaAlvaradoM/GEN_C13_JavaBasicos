package poo.herencia.Vehiculo;

public class Motocicleta extends Vehiculo {
    public Motocicleta(String marca) {
        super(marca);
    }
    @Override
    public String describir() {
        return super.describir() + " | Motocicleta";
    }
}