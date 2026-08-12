package poo.herencia.empleado;

public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() { return this.nombre; }

    public double calcularSalario() {
        return this.salarioBase;
    }
}
