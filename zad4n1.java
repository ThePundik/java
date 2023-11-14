package lab4;
import java.lang.Math;
import java.lang.StrictMath;
import java.util.Random;


public class zad4n1 {
    public static void main (String args[]){
        int Tablica[] = new int [100];
        Tablica1(Tablica);
    }

    public static void Tablica1(int Tablica[]){
        for(int i = 0; i<Tablica.length; i++){
            Tablica[i] = i;
            System.out.println(Tablica[i]);
        }
    }
    
    
}