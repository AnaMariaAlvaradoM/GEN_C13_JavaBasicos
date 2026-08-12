package poo;

public class Reserva {
    private String huesped;
    private int numeroHabitacion;
    private double precioPorNoche;
    private boolean confirmada;

    //! Constructor vacio
    public Reserva(){
    }

    //! Constructor con parámetros
    public Reserva(String huesped, int numeroHabitacion, double precioPorNoche, boolean confirmada) {
        this.huesped = huesped;
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.confirmada = confirmada;
    }

    public Reserva(String huesped, int numeroHabitacion) {
        this.huesped = huesped;
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = 150000.0;
        this.confirmada = false;
    }


    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

//    public void setPrecioPorNoche(double precioPorNoche) {
//        this.precioPorNoche = precioPorNoche;
//    }

    public void setPrecioPorNoche(double precioPorNoche) {
        if (precioPorNoche <= 0) {
            System.out.println("Error: el precio debe ser mayor a cero.");
            return;
        }
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public void imprimir() {
        System.out.println("Cliente: " + this.huesped);
        System.out.println("Habitación: " + this.numeroHabitacion);
        System.out.println("Precio/noche: $" + this.precioPorNoche);
        System.out.println("---");
    }

    public double calcularTotal(int noches) {
        return this.precioPorNoche * noches;
    }

    public double calcularTotal(int noches, double descuento) {
        double base = this.precioPorNoche * noches;
        return base * (1 - descuento / 100);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "huesped='" + huesped + '\'' +
                ", numeroHabitacion=" + numeroHabitacion +
                ", precioPorNoche=" + precioPorNoche +
                ", confirmada=" + confirmada +
                '}';
    }
}
