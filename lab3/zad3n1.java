import java.util.Scanner;
public class zad3n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj znak: ");
        char znak = sc.nextLine().charAt(0);
        System.out.println("Podaj lancuch znakow: ");
        String lancuch = sc.nextLine();
        sc.close();

        int iloscWystapien = zliczWystapieniaZnaku(znak, lancuch);
        System.out.println("Znak '" + znak + "' występuje " + iloscWystapien + " razy w łańcuchu.");
    }

    public static int zliczWystapieniaZnaku(char znak, String lancuch) {
        int iloscWystapien = 0;
        for (int i = 0; i < lancuch.length(); i++) {
            if (lancuch.charAt(i) == znak) {
                iloscWystapien++;
            }
        }
        return iloscWystapien;
    }
}
