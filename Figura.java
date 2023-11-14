import java.awt.Color;
public class zad5n1 {

    public class Figura {
    // Pola
    protected int pole;
    protected int obwod;
    private Color kolor;

    // Konstruktor
    public Figura(int pole, int obwod, Color kolor) {
        this.pole = pole;
        this.obwod = obwod;
        this.kolor = kolor;
    }

    // Metody chronione (protected)
    protected void rysuj() {
        // Implementacja rysowania figury
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

    public int getPole(){
        return pole;
    }
    
    public void setPole(){
        this.pole = pole;
    }

    public int getObwod(){
        return obwod;
    }

    public void setObwod(){
        this.obwod = obwod;
    }

    public Color getKolor(){
        return kolor;
    }

    public void setKolor(){
        this.kolor = kolor;
    }
}
}
