import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, carrera, edad);

        if (edad < 18) {
            System.out.println("Estudiante menor de edad.");
        } else if (edad <25) {
            System.out.println("Estudiante joven.");
        } else {
            System.out.println("Estudiante adulto.");
        }

        estudiante.mostrarInformacion();

        for (int i= 1; i <= 5; i++) {
            System.out.println("Procesando estudiante " + i);
        }

        int opcion = -1;
        while (opcion !=0){


        System.out.println("==Sistema de DUOC UC==");
        System.out.println("1.- Mostrar estado");
        System.out.println("2.- Procesar la operación");
        System.out.println("0.- Salir");
        System.out.println("Seleccione una opción: ");
        opcion = scanner.nextInt();
}
    if (opcion == 1) {
        System.out.println("Sistema operativo.");
    } else if (opcion == 2) {
        System.out.println("Procesando operación...");
    } else if (opcion == 0) {
        System.out.println("Cerrando sistema...");
    }
}
}

