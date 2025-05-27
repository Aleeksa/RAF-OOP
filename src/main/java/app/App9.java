package app;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.*;

public class App9 {
    public static void main(String[] args) {
        List<Integer> lista3 = new ArrayList<Integer>();
       // lista3.addAll(List.of(5,4,3,2));
        lista3.addAll(List.of(20,80,90,90,1));
        ObservableList<Integer> observableList = FXCollections.observableList(lista3);
        System.out.println(observableList instanceof List);
        System.out.println(observableList instanceof ArrayList);
        System.out.println(observableList instanceof FXCollections);
        System.out.println(observableList instanceof Collection);
        observableList.addListener(new ListChangeListener<Integer>() {
            @Override
            public void onChanged(Change<? extends Integer> change) {
                System.out.println("Promena na listi");
                while (change.next()){
                    if(change.wasAdded()){
                        System.out.println("dodati " + change.getAddedSubList());
                    }
                    if(change.wasRemoved()){
                        System.out.println("uklonjeno : "+ change.getRemoved());
                    }
                }
            }
        });
       /* observableList.remove(3);
        observableList.addAll(List.of(5,6));
        lista3.add(9);
        lista3.add(10);
        lista3.removeAll(List.of(3,5,10));
        System.out.println(observableList);
        System.out.println(lista3);*/
        lista3.addAll(List.of(100,100));
        observableList.remove(1);
        observableList.add(20);
        lista3.add(30);
        lista3.removeAll(List.of(20,90));
        System.out.println(observableList);
        System.out.println(lista3);
    }
}
