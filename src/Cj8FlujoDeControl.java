public class Cj8FlujoDeControl {
    public static void main(String[] args) {
        //! If Else
        String rol = "empleado";
        int intentos = 2;

        if (rol.equals("admin") && intentos == 0) {
            System.out.println("Acceso total");
        } else if (rol.equals("empleado")) {
            System.out.println("Acceso parcial");
        } else if (rol.equals("invitado")) {
            System.out.println("Solo lectura");
        } else {
            System.out.println("Acceso denegado");
        }


        String rolUsuario = "empleado";
        int intentosFallidos = 2;

        if (rolUsuario.equals("admin") && intentosFallidos == 0) {
            System.out.println("Admin sin alertas — acceso inmediato");
        } else if (rolUsuario.equals("admin") && intentosFallidos > 0) {
            System.out.println("Admin con intentos fallidos — verificación adicional");
        } else if (rolUsuario.equals("empleado") && intentosFallidos < 3) {
            System.out.println("Empleado — acceso con advertencia");
        } else {
            System.out.println("Cuenta bloqueada — contacte al administrador");
        }


        //! Sintaxis
//        if(condicion){
//            //bloque
//        } else if (condicion){
//            //bloque 2
//        } else {
//            //bloque 3
//        }


        int codigoError = 403;

        switch (codigoError) {
            case 200:
                System.out.println("Autenticación exitosa");
                break;
            case 401:
                System.out.println("Credenciales inválidas");
                break;
            case 403:
                System.out.println("Sin permisos");
                break;
            default:
                System.out.println("no fue nada");
        }

        int intentosRestantes = 0;

        while (intentosRestantes > 0) {
            System.out.println("Procesando intento...");
            intentosRestantes--;
        }

        System.out.println("Sistema bloqueado: " + intentosRestantes);

    }
}

