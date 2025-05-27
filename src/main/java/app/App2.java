package app;

public class App2 {
    public static class KlasaA{
        private int br1;
        private int br2;

        public KlasaA(int br){
            this(br,br*3);
        }
        public KlasaA(int br1, int br2){
            this.br1 = br1;
            this.br2 = br2;
        }

        @Override
        public String toString() {
            return this.br1 + " " + this.br2;
        }
    }

    public static void main(String[] args) {
        KlasaA klasaA = new KlasaA(10);
        System.out.println(klasaA);
    }
}
