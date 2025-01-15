import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";

        System.out.println("Introduce una frase: ");
        frase = scanner.nextLine();

        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Invertir frase");
            System.out.println("2. Pasar a mayúsculas");
            System.out.println("3. Pasar a minúsculas");
            System.out.println("4. Mostrar frase");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    String fraseInvertida = new StringBuilder(frase).reverse().toString();
                    System.out.println("Frase invertida: " + fraseInvertida);
                    break;
                case 2:
                    System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
                    break;
                case 3:
                    System.out.println("Frase en minúsculas: " + frase.toLowerCase());
                    break;
                case 4:
                    System.out.println("Frase original: " + frase);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor elige entre 1 y 5.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
