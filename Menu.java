import java.util.Scanner;

public class Menu {
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
        } while (opcion != 5);
        sc.close();
    }
}
