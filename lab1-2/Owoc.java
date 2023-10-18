public class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa, double masa){
        this.nazwa = nazwa;
        this.masa = masa;
    }

    public void wyswetl(){
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Masa: " + masa);
    }

    public static void main(String[] args){
        Owoc banan = new Owoc("Banan", 300.0);
        Owoc jablko = new Owoc("Jablko", 100.0);
        
        System.out.println("Dane owoca 1: ");
        banan.wyswetl();
        System.out.println("Dane owoca 2: ");
        jablko.wyswetl();
    }
}