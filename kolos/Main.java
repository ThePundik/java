package kolos;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Figura> kolekcjaFigur = generujKolekcjeFigur(5); // Generowanie 5 losowych figur
        przetestujFunkcjonalnosc(kolekcjaFigur); // Testowanie funkcjonalności
    }

    // Generowanie losowej kolekcji obiektów typu figura zawierającej kwadraty i trójkąty
    public static List<Figura> generujKolekcjeFigur(int ilosc) {
        Random random = new Random();
        List<Figura> kolekcjaFigur = new ArrayList<>();

        for (int i = 0; i < ilosc; i++) {
            int wyborFigury = random.nextInt(2); // Losowanie liczby 0 lub 1 dla kwadratu lub trójkąta

            if (wyborFigury == 0) {
                // Dodanie losowego kwadratu do kolekcjiFigur
                double dlugoscBoku = random.nextDouble() * 10 + 1; // Losowa długość boku od 1 do 10
                Kwadrat kwadrat = new Kwadrat(dlugoscBoku);
                kolekcjaFigur.add(kwadrat);
            } else {
                // Dodanie losowego trójkąta do kolekcjiFigur
                double a = random.nextDouble() * 10 + 1; // Losowa długość boku a od 1 do 10
                double b = random.nextDouble() * 10 + 1; // Losowa długość boku b od 1 do 10
                double c = random.nextDouble() * 10 + 1; // Losowa długość boku c od 1 do 10
                Trojkat trojkat = new Trojkat(a, b, c);
                kolekcjaFigur.add(trojkat);
            }
        }
        return kolekcjaFigur;
    }

    // Testowanie funkcjonalności
    public static void przetestujFunkcjonalnosc(List<Figura> kolekcjaFigur) {
        for (Figura figura : kolekcjaFigur) {
            if (!figura.czyMoznaZbudowacFigure()) {
                System.out.println("Nie można zbudować poprawnej figury!");
                throw new ArithmeticException("Niepoprawne wartości atrybutów");
            }
        }
        System.out.println("Wszystkie figury zbudowane poprawnie!");
    }
}
