import java.util.Scanner;

public class mojaKlasa {
    private int liczba;
    private char znak;
    private String tekst;

public mojaKlasa(int liczba, char znak, String tekst){
    this.liczba = liczba;
    this.znak = znak;
    this. tekst = tekst;
}

    
    public static void main(String[] args) {
        mojaKlasa obiekt = new mojaKlasa(42, 'a', "hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scanner.nextInt();
        System.out.println(i);
        System.out.println("Wartość pola 'liczba': " + obiekt.liczba);
        System.out.println("Wartość pola 'znak': " + obiekt.znak);
        System.out.println("Wartość pola 'tekst': " + obiekt.tekst);
        scanner.close();
    }
    public static void licz()
    {
        for(int i=0 ; i<=54; i++){
            System.out.println(i);
        }
    }
}
