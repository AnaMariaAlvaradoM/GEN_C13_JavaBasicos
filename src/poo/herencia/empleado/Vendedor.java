package poo.herencia.empleado;

public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.comision;
    }
}