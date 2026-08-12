package poo.herencia.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro("Toyota", 4);
        vehiculos[1] = new Motocicleta("Honda");
        vehiculos[2] = new Carro("Ford", 2);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.describir());
        }
    }

}
