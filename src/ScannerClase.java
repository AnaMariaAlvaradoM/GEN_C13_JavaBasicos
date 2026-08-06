import java.util.Scanner;

public class ScannerClase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.println("Ciudad ingresada: " + ciudad);


        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

    }
}
