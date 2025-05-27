package app;

import java.util.Map;
import java.util.TreeMap;

public class App11 {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new TreeMap<Integer, String>((a,b)->b-a);
        mapa.put(5,"januar");
        mapa.put(2,"februar");
        mapa.put(8,"maj");
        System.out.println(mapa.put(2,"decembar"));
        System.out.println(mapa);
        System.out.println(mapa.keySet());
    }
}
