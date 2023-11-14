package lab5;
import java.awt.Color;

public class Wielokat extends Figura {
    private int liczbaWierzcholkow;
    private int liczbaBokow;
    private double sumaKatowWewnetrznych;

    public Wielokat(int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych, int pole, int obwod, Color kolor) {
        super(pole, obwod, kolor);
        this.liczbaWierzcholkow = liczbaWierzcholkow;
        this.liczbaBokow = liczbaBokow;
        this.sumaKatowWewnetrznych = sumaKatowWewnetrznych;
    }

    public int getLiczbaWierzcholkow(int liczbaWierzcholkow){
        return liczbaWierzcholkow;
    }

    public void setLiczbaWierszcholkow(int liczbaWierzcholkow){
        this.liczbaWierzcholkow = liczbaWierzcholkow;
    }

    public int getLiczbaBokow(int liczbaBokow){
        return liczbaBokow;
    }

    public void setLiczbaBokow(int liczbaBokow){
        this.liczbaBokow = liczbaBokow;
    }

    public double getSumaKatowWewnetrznych(double sumaKatowWewnetrznych){
        return sumaKatowWewnetrznych;
    }

    public void setSumaKatowWewnetrznych(double sumaKatowWewnetrznych){
        this.sumaKatowWewnetrznych = sumaKatowWewnetrznych;
    }

    

    @Override
    protected void rysuj() {
        super.rysuj();
        System.out.println("Rysowanie wielokąta...");
    }

    @Override
    protected void usuń() {
        super.usuń();
        System.out.println("Usuwanie wielokąta...");
    }

    @Override
    protected void przesuń() {
        super.przesuń();
        System.out.println("Przesuwanie wielokąta...");
    }

    @Override
    protected String podajParametry() {
        return super.podajParametry() + ", Liczba wierzchołków: " + liczbaWierzcholkow +
                ", Liczba boków: " + liczbaBokow + ", Suma kątów: " + sumaKatowWewnetrznych;
    }
    
}
