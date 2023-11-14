package lab5;
import java.awt.Color;
public class Elipsa extends Figura {
    private double a;
    private double b;
    private double F1x, F1y, F2x, F2y;
    private double c;

    public Elipsa(double a, double b, double F1x, double F1y, double F2x, double F2y, double c, int pole, int obwod, Color kolor) {
        super(pole, obwod, kolor);
        this.a = a;
        this.b = b;
        this.F1x = F1x;
        this.F1y = F1y;
        this.F2x = F2x;
        this.F2y = F2y;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getF1x() {
        return F1x;
    }

    public void setF1x(double f1x) {
        F1x = f1x;
    }

    public double getF1y() {
        return F1y;
    }

    public void setF1y(double f1y) {
        F1y = f1y;
    }

    public double getF2x() {
        return F2x;
    }

    public void setF2x(double f2x) {
        F2x = f2x;
    }

    public double getF2y() {
        return F2y;
    }

    public void setF2y(double f2y) {
        F2y = f2y;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    protected void rysuj() {
        super.rysuj();
        System.out.println("Rysowanie elipsy...");
    }

    @Override
    protected void usuń() {
        super.usuń();
        System.out.println("Usuwanie elipsy...");
    }

    @Override
    protected void przesuń() {
        super.przesuń();
        System.out.println("Przesuwanie elipsy...");
    }

    @Override
    protected String podajParametry() {
        return super.podajParametry() + " , a: " + a + " , b: " + b + " , c: " + c;
    }

}