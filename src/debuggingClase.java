public class debuggingClase {
    public static void main(String[] args) {
//        int precio = "cinco mil";
//        System.out.println(precio);

//        int[] ventas = {15000, 23000, 8000, 31000, 12000};
//        System.out.println(ventas[5]);

        int[] ventas = {15000, 23000, 8000, 31000, 12000};
        int total = 0;

        for (int i = 0; i < ventas.length; i++) {
            total = total + ventas[i];
        }

        System.out.println("Total: " + total);
    }
}
