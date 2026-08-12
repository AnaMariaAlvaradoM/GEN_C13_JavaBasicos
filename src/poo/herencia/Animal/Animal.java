package poo.herencia.Animal;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return this.nombre; }

    public String hacerSonido() {
        return "Sonido genérico";
    }

    public String describir() {
        return this.nombre + " hace: " + hacerSonido();
    }
}
