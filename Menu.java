import java.util.Scanner;

public class Menu {
    public static String invertirFrase(String frase) {
        StringBuilder sb = new StringBuilder(frase);
        return sb.reverse().toString();
    }
    public static void mostrarFrase(String frase) {
        System.out.println("Frase: " + frase);
    }
    public static String pasarMayusculas(String frase) {
        return frase.toUpperCase();
    }
    public static String pasarMinusculas(String frase) {
        return frase.toLowerCase();
    }        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        System.out.println("Introduce una frase:");
        frase = sc.nextLine();
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

            switch (opcion) {
                case 1:
                    System.out.println(invertirFrase(frase));
                    break;
                case 2:
                    // System.out.println(pasarMayusculas(frase));  // Método para pasar a mayúsculas
                    break;
                case 3:
                    // System.out.println(pasarMinusculas(frase));  // Método para pasar a minúsculas
                    break;
                case 4:
                    mostrarFrase(frase);
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
