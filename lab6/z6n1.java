package lab6;
import java.util.Scanner;

public class z6n1 {
    
    public static float dodawanie(float a, float b){
        float result;
        result = a +b;
        return result;
    }

    public static float odejmowanie(float a, float b){
        float result;
        result = a-b;
        return result;
    }

    public static float mnozenie(float a, float b){
        float result;
        result = a*b;
        return result;
    }

    public static float dzielenie(float a, float b){
        float result;
        result = a/b;
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        float liczba1 = sc.nextFloat();
        System.out.println("Podaj liczbe b: ");
        float liczba2 = sc.nextFloat();
        System.out.println("\tWybierz funkcje! ");
        System.out.println("\t1. dodawanie\n\t2. odejmowanie\n\t3. mnozenie\n\t4. dzielenie\n\t0. wyjscie z programu.");
        int wybor = sc.nextInt();
        switch (wybor) {
            case 1:{
                System.out.println(dodawanie(liczba1, liczba2));
                break;
            }
            case 2:{
                System.out.println(odejmowanie(liczba1, liczba2));
                break;
            }
            case 3:{
                System.out.println(mnozenie(liczba1, liczba2));
                break;
            }
            case 4:{
                System.out.println(dzielenie(liczba1, liczba2));
                break;
            }
            case 0:{
                System.out.println("Dziekuje za korzystanie z kalkulatora! ");
                break;
            }
            default:{
                System.out.println("\tNieprawidlowy wybor funkcji! ");
                break;
            }
        }

        sc.close();
    }

}
