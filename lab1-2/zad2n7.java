public class zad2n7 {
    public static void main(String[] args) {
        wypiszPodzielnePrzez13(11, 111);
    }

    public static void wypiszPodzielnePrzez13(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 13 == 0) {
                System.out.println(i);
            }
        }
    }
}
