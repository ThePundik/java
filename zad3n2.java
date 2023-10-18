import java.util.Scanner;

public class zad3n2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj lancuch znakow: ");
        String lancuch = sc.nextLine();
        int suma = lancuchZnakow(lancuch);
        System.out.println("Suma znakow: " +suma);
        sc.close();
    }

    public static int lancuchZnakow(String lancuch) {
        int suma = 0;
        for (int i = 0; i < lancuch.length(); i++) {
            char znak = lancuch.charAt(i);

            // Sprawdzamy, czy znak jest małą literą lub cyfrą.
            if ((znak >= 'a' && znak <= 'z') || (znak >= '0' && znak <= '9')) {
                suma += (int) znak;
            }
        }

        return suma;
    }
}
