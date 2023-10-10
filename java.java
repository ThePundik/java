public class java {

    public static void main(String[] args) {
      int tab[] = new int [10];
      for (int i = 0; i<tab.length; i++)
      {
        tab[i] = i;
      }
      for (int t : tab)
      {
        System.out.println(t);
      }
    }
}