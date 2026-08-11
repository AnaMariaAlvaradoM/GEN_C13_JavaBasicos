package javaBasicos;

public class Cj6Variables {
    public static void main(String[] args) {
        System.out.println("lo que sea");
        int x = 5;
        //x = "hola"; // error
        x = 10;// válido

        //! Tipos de datos:
        byte edad = 12;
        short anio = 2026;
        int habitantes = 800;
        long id = 800000000000000L;


        float precio = 9.99f;
        double saldo = 1.585;

        char letra = 'A';

        boolean estaActivo = true;
        boolean estaActivo2 = false;

        //! Formas de impresión

        System.out.println("Con salto");
        System.out.println("Con salto");
        System.out.print("Sin salto ");
        System.out.print("Sin salto ");
        System.out.print("pegado\n");
        System.out.print("pegado\n");
        System.out.println();

        System.out.println();

        //! Concatenación

        String nombre = "Ana";
        int puntos = 950;

        System.out.println(
                "Usuario: " + nombre +
                        " | Puntos: " + puntos
        );

        //! Formato
        String perfil = String.format(
                "Usuario: %s | Puntos: %d",
                nombre, puntos
        );

        System.out.printf(
                "Precio: $%,.2f%n", 9990.50
        );


        var ciudad = "Bogotá";
        var nivel = 5;
        var saldo2 = 1500.70;

        //ciudad = 100;

        //! Constantes

        final double IVA = 0.19;

        // IVA = 0.20;


        //! String
        String nombr = "Ana";

    }
}