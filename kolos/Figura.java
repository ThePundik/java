<<<<<<< HEAD
=======
package kolos;
>>>>>>> origin/main
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Figura {
    // Wspólne właściwości figur geometrycznych
    protected double bokA;
    protected double bokB;
    protected double bokC;

    public Figura(double a, double b, double c) {
        this.bokA = a;
        this.bokB = b;
        this.bokC = c;
    }

    public double getBokA() {
        return bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public double getBokC() {
        return bokC;
    }

    // Metoda do sprawdzania czy wartości atrybutów pozwalają na zbudowanie poprawnej figury
    public boolean czyMoznaZbudowacFigure() {
        // Implementacja zależna od konkretnej figury - w klasach dziedziczących
        return true;
    }
}

class Kwadrat extends Figura {
    public Kwadrat(double a) {
        super(a, a, a);
    }

    @Override
    public boolean czyMoznaZbudowacFigure() {
        // W przypadku kwadratu każde dwa boki muszą być równe
        return bokA == bokB && bokB == bokC;
    }
}

class Trojkat extends Figura {
    public Trojkat(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public boolean czyMoznaZbudowacFigure() {
        // W przypadku trójkąta suma długości dwóch dowolnych boków musi być większa niż długość trzeciego
        return (bokA + bokB > bokC) && (bokA + bokC > bokB) && (bokB + bokC > bokA);
    }
<<<<<<< HEAD
}

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
=======
}
>>>>>>> origin/main
