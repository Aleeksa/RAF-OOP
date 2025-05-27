package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String brojevi[] = in.nextLine().split(" ");
        List<Integer> brojeviLista = null;
        try{
            if(Integer.parseInt(brojevi[0])%2 == 0){
                brojeviLista = new ArrayList<Integer>();
                brojeviLista.add(2);
            }
            Integer br1 = Integer.parseInt(brojevi[1]);
            brojeviLista.add(br1);
            Integer br2 = Integer.parseInt(brojevi[2]);
            brojeviLista.add(br2);
            if(brojeviLista.size() > 1){
                System.out.println("vise od 2 elementa");
            }
            System.out.println("kraj try bloka");
        }
        catch (NumberFormatException e){
            System.out.println("format");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("indeks");
        }
        finally {
            System.out.println("blok finally");
        }
        System.out.println("Lista = " + brojeviLista);
    }
}
