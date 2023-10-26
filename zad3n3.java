import java.util.Scanner;

public class zad3n3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz liczbe z zakresu <33, 126>: ");
        int licz = sc.nextInt();
        sc.close();
        char znak = char1(licz);
        if(znak != 0){
            System.out.println("Znak przypisany do liczby " + licz + " to: " +znak);
        }
        else{
            System.out.println("Wprowodzone bledna liczbe! ");
        }
    }


    public static char char1(int licz){
        if(licz >=33 && licz <=126){
            return (char) licz;
        }
        else{
            return 0;
        }
    }
}

