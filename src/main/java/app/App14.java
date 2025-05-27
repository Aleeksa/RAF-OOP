package app;

public class App14 {
    public static void main(String[] args) {
        Brojaci1.brojac3 = 100;
        System.out.println("test1 main metoda");
        Brojaci1 b1 = new Brojaci1(10);
        System.out.println(b1);
        Brojaci1 b2 = b1;
        System.out.println(b2);
        b1.brojac2++;
        System.out.println(b2.equals(b1));
        System.out.println(b1==b2);
        Brojaci1 b3 = new Brojaci1(10);
        b3.brojac2++;
        System.out.println(b2.equals(b3));
        System.out.println(b2==b3);
        System.out.println(b2);
        System.out.println(b1);
        System.out.println(Brojaci1.brojac3);
    }
}
