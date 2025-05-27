package app;

public class App3 {

    public static class PomocnaKlasa{
        public int br;
        public static int brojac;

        public PomocnaKlasa(int br){
            this.br = br;
        }

        @Override
        public String toString() {
            brojac++;
            return "br = " + String.valueOf(br);
        }

        static {
            System.out.println("static blok");
        }
    }

    public static void main(String[] args) {
        System.out.println("Glavna main klasa");
        PomocnaKlasa.brojac = 50;
        PomocnaKlasa pk1 = new PomocnaKlasa(4);
        PomocnaKlasa pk2 = pk1;
        PomocnaKlasa pk3 = new PomocnaKlasa(4);
        System.out.println(pk1.equals(pk3));
        System.out.println(pk1.equals(pk2));
        System.out.println(pk2);
        System.out.println(pk2);
        pk2.br = 25;
        System.out.println(pk2);
        System.out.println(pk1);
        System.out.println(PomocnaKlasa.brojac);
    }
}
