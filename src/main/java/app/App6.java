package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite sa razmakom");
        String brojevi[] = in.nextLine().split(" ");
        List<Integer> veliki = null;
        try {
            int br1 = Integer.parseInt(brojevi[0]);
            if(br1>1000){
                veliki = new ArrayList<Integer>();
                veliki.add(br1);
            }
            int br2 = Integer.parseInt(brojevi[1]);
            if(br2>1000){
                veliki.add(br2);
            }
            System.out.println("kraj try bloka");
        }
        catch (NumberFormatException e2){
            System.out.println("pogreasn format");
        }
        catch (NullPointerException e2){
            System.out.println("null pointer");
        }
        finally {
            System.out.println("Blok finally");
        }
        System.out.println("Lista veliki = " + veliki);
        in.close();
    }
}
