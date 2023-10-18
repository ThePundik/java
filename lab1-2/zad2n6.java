import java.util.Scanner;

public class zad2n6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość pierwszego boku trójkąta: ");
        int a = scanner.nextInt();

        System.out.print("Podaj długość drugiego boku trójkąta: ");
        int b = scanner.nextInt();

        System.out.print("Podaj długość trzeciego boku trójkąta: ");
        int c = scanner.nextInt();

        String wynik = sprawdzTrojkat(a, b, c);
        System.out.println(wynik);

        scanner.close();
    }
    
    public static String sprawdzTrojkat(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "Trójkąt równoboczny";
            } else if (a == b || a == c || b == c) {
                return "Trójkąt równoramienny";
            } else {
                return "Trójkąt różnoboczny";
            }
            } else {
                return "Nie można zbudować trójkąta z podanych boków";
            }
        }
    
}
