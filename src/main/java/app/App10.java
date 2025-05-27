package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("unesite brojeve sa razmakom: ");
        String brojevi[] = sc.nextLine().split(" ");
        List<String> desetice = new ArrayList<String>();
        try{
            int br0 = Integer.parseInt(brojevi[0]);
            if(br0%10 == 0){
                desetice.add(brojevi[0]);
            }
            else{
                desetice.add(null);
            }
            desetice.add(brojevi[1]);
            if(desetice.get(0).equals(desetice.get(1)));
            System.out.println("ista prva dva elementa");
            System.out.println("kraj try bloka");
        }
        catch (NumberFormatException e){
            System.out.println("pogresan format");
        }
        catch (NullPointerException e){
            System.out.println("null pointer");
        }
        finally {
            System.out.println("blok finally");
        }
        System.out.println("Lista = " + desetice);
        sc.close();
    }
}
