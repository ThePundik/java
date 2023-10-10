public class Uczen{
    private String imie, nazwisko;
    private int wiek;
    private double srednia;

    public Uczen(){
        this.imie = "";
        this.nazwisko = "";
        this.wiek = 0;
        this.srednia = 0.0;
    }

    public Uczen(String imie, String nazwisko, int wiek, double srednia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.srednia = srednia;
    }

    public void wyswietlDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Średnia: " + srednia);
        System.out.println();
    }

    public void ustawImie(String imie){
        this.imie = imie;
    }

    public void ustawNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public void ustawWiek(int wiek){
        this.wiek = wiek;
    }

    public void ustawSrednia(double srednia){
        this.srednia = srednia;
    }


    public static void main(String[] args){
        Uczen uczen1 = new Uczen("Daniel", "Warchol", 19, 4.0);
        Uczen uczen2 = new Uczen("Jan", "Kowalski", 20, 3.5);
        Uczen uczen3 = new Uczen();

        uczen3.ustawImie("Pawel");
        uczen3.ustawNazwisko("Kowalski");
        uczen3.ustawWiek(21);
        uczen3.ustawSrednia(5.0);


        System.out.println("Dane ucznia 1:");
        uczen1.wyswietlDane();

        System.out.println("Dane ucznia 2:");
        uczen2.wyswietlDane();

        System.out.println("Dane ucznia 3:");
        uczen3.wyswietlDane();

        
    }
}