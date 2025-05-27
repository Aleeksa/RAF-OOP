package app;

public class Brojaci1 {
    private int brojac1;
    public int brojac2;
    public static int brojac3 = 1;

    public Brojaci1(int br){
        this.brojac1 = br;
        this.brojac2 = br*2;
        brojac3++;
    }

    static {
        System.out.println("Brojac3 = " + brojac3);
    }

    @Override
    public String toString() {
        brojac3++;
        brojac1--;
        return "brojac1 = " + brojac1 + " ,brojac2 = " + brojac2;
    }

    @Override
    public boolean equals(Object obj){
        return this.brojac2 == ((Brojaci1)obj).brojac2;
    }
}
