import java.util.Scanner;

public class DoWhileScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String USUARIO_OK = "admin";
        final String CLAVE_OK = "admin123";
        boolean autenticado = false;
        int intentos = 3;

        do {
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String clave = scanner.nextLine();

            if (usuario.equals(USUARIO_OK) && clave.equals(CLAVE_OK)) {
                autenticado = true;
                System.out.println("Bienvenido al sistema");
            } else {
                intentos--;
                System.out.println("Credenciales incorrectas. Intentos: " + intentos);
            }
        } while (intentos > 0 && !autenticado);

        scanner.close();
    }
}
