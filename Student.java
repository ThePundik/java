import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Student {
    private String imie;
    private String nazwisko;
    private String email;
    private List<Obecnosc> obecnosci;

    public Student(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.obecnosci = new ArrayList<>();
    }

    public void dodajObecnosc(Obecnosc obecnosc) {
        obecnosci.add(obecnosc);
    }

    public List<Obecnosc> getObecnosci() {
        return obecnosci;
    }

    public String toString() {
        return "Student: " + imie + " " + nazwisko + ", Email: " + email;
    }

    public List<String> przedmiotyZawszeObecny() {
        Map<String, Boolean> obecnosciMap = new HashMap<>();

        for (Obecnosc obecnosc : obecnosci) {
            obecnosciMap.put(obecnosc.getPrzedmiot(), true);
        }

        List<String> przedmiotyZawszeObecny = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : obecnosciMap.entrySet()) {
            if (entry.getValue()) {
                przedmiotyZawszeObecny.add(entry.getKey());
            }
        }

        return przedmiotyZawszeObecny;
    }

    public static boolean sprawdzImie(String imie) {
        // Sprawdź, czy imię zawiera tylko litery
        return imie.matches("[a-zA-Z]+");
    }

    public static Student pobierzDaneOdUzytkownika() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię studenta: ");
        String imie = scanner.nextLine();

        while (!sprawdzImie(imie)) {
            System.out.println("Błędne imię. Imię może zawierać tylko litery.");
            System.out.print("Podaj imię studenta: ");
            imie = scanner.nextLine();
        }

        System.out.print("Podaj nazwisko studenta: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj adres e-mail studenta: ");
        String email = scanner.nextLine();

        return new Student(imie, nazwisko, email);
    }

    public static void main(String[] args) {
        // Przykładowe użycie
        Student student = pobierzDaneOdUzytkownika();

        Obecnosc obecnosc1 = new Obecnosc("2023-01-01 10:00", "Matematyka", "nn");
        Obecnosc obecnosc2 = new Obecnosc("2023-01-02 14:30", "Fizyka", "o");
        Obecnosc obecnosc3 = new Obecnosc("2023-01-03 09:45", "Informatyka", "nn");

        student.dodajObecnosc(obecnosc1);
        student.dodajObecnosc(obecnosc2);
        student.dodajObecnosc(obecnosc3);

        System.out.println(student.toString());

        List<String> przedmiotyZawszeObecny = student.przedmiotyZawszeObecny();
        System.out.println("Przedmioty, na których student był zawsze obecny: " + przedmiotyZawszeObecny);
    }
}

class Obecnosc {
    private String dataGodzina;
    private String przedmiot;
    private String typObecnosci;

    public Obecnosc(String dataGodzina, String przedmiot, String typObecnosci) {
        this.dataGodzina = dataGodzina;
        this.przedmiot = przedmiot;
        this.typObecnosci = typObecnosci;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }
}