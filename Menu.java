import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";

        // Solicitar al usuario una frase
        System.out.println("Introduce una frase:");
        frase = sc.nextLine();

        // Menú de opciones
        int opcion = 0;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Invertir frase.");
            System.out.println("2. Pasar a mayúsculas.");
            System.out.println("3. Pasar a minúsculas.");
            System.out.println("4. Mostrar frase.");
            System.out.println("5. Salir.");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            // Llamada a métodos según opción seleccionada (comentadas por ahora)
            switch (opcion) {
                case 1:
                    // System.out.println(invertirFrase(frase));  // Método de inversión de la frase
                    break;
                case 2:
                    // System.out.println(pasarMayusculas(frase));  // Método para pasar a mayúsculas
                    break;
                case 3:
                    // System.out.println(pasarMinusculas(frase));  // Método para pasar a minúsculas
                    break;
                case 4:
                    // mostrarFrase(frase);  // Método para mostrar la frase
                    break;
                case 5:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
