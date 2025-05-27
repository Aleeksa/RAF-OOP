package app;

import java.util.Map;
import java.util.TreeMap;

public class App13 {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new TreeMap<String, Integer>((a1,a2)->a1.length() - a2.length());
        mapa.put("branka",23);
        mapa.put("ana",21);
        System.out.println(mapa.put("ceca",20));
        System.out.println(mapa.put("branka",24));
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        for(Map.Entry<String,Integer> e:mapa.entrySet()){
            System.out.println(e.getValue());
        }
    }
}
