public class zad2n5{
    public static void main(String[] args){
        for (int i = 5; i <= 80; i += 15) {
            System.out.print(i + " ");
        }


        int i = 5;
        while (i <= 80) {
            System.out.print(i + " ");
            i += 15;
        }

        do {
            System.out.print(i + " ");
            i += 15;
        } while (i <= 80);


        
    }
}