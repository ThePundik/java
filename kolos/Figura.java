package kolos;
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
}
