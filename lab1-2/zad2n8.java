public class zad2n8 {
    public static void main(String[] args) {
        int n = 10;

        wyswietlCiagFibonacciego(n);
    }

    public static void wyswietlCiagFibonacciego(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
