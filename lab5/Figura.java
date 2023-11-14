package lab5;
import java.awt.Color;

public class Figura {
    protected int pole;
    protected int obwod;
    private Color kolor;

    public Figura() {
        // Konstruktor bezparametrowy
        pole = 0;
        obwod = 0;
        kolor = Color.BLACK;
    }

    public Figura(int pole, int obwod, Color kolor) {
        this.pole = pole;
        this.obwod = obwod;
        this.kolor = kolor;
    }

    protected void rysuj() {
        System.out.println("Rysowanie figury...");
    }

    protected void usuń() {
        System.out.println("Usuwanie figury...");
    }

    protected void przesuń() {
        System.out.println("Przesuwanie figury...");
    }

    protected String podajParametry() {
        return "Pole: " + pole + ", Obwód: " + obwod + ", Kolor: " + kolor.toString();
    }

    // Gettery i Settery
    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getObwód() {
        return obwod;
    }

    public void setObwód(int obwód) {
        this.obwod = obwód;
    }

    public Color getKolor() {
        return kolor;
    }

    public void setKolor(Color kolor) {
        this.kolor = kolor;
    }
    
}
