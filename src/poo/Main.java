package poo;

public class Main {
    public static void main(String[] args) {
        Reserva r = new Reserva();
//        r.huesped = "Carlos Méndez";
//        r.precioPorNoche = -50000.0;
//        System.out.println(r.precioPorNoche);

        //Reserva reserva2 = new Reserva("Carlos Méndez", 101, 50000.0, true);
        Reserva reserva3 = new Reserva("Ana Gómez", 202);


        Reserva reserva2 = new Reserva("Carlos Méndez", 101, 50000.0, true);
        System.out.println(reserva2.getHuesped());
        System.out.println(reserva2.getPrecioPorNoche());
        System.out.println(reserva2.isConfirmada());

        reserva2.setNumeroHabitacion(102);
        System.out.println(reserva2.getNumeroHabitacion());

        r.setHuesped("Juan Pérez");
        r.setNumeroHabitacion(303);
        r.setPrecioPorNoche(-75000.0);
        r.setConfirmada(true);
        System.out.println(r.getHuesped());
        System.out.println(r.getNumeroHabitacion());
        System.out.println(r.getPrecioPorNoche());
        System.out.println(r.isConfirmada());

    }
}
