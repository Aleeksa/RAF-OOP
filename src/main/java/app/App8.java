package app;

import java.util.HashMap;
import java.util.Map;

public class App8 {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("januar",5);
        mapa.put("februar",10);
        Integer broj = mapa.put("januar",20);
        System.out.println(broj);
        System.out.println(mapa);
        System.out.println(mapa.keySet());
    }
}
