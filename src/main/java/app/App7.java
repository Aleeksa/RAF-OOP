package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

public class App7 {
    public static void main(String[] args) {
        List<Integer> mojaLista = new ArrayList<Integer>();
        mojaLista.addAll(List.of(2,1,1,2,3));
        ObservableList<Integer> observableList = FXCollections.observableArrayList(mojaLista);
        System.out.println(observableList instanceof List);
        System.out.println(observableList instanceof FXCollections);
        System.out.println(observableList instanceof Object);
        System.out.println(observableList instanceof ListView);
        mojaLista.add(5);
        observableList.removeAll(List.of(2,3,4));
        System.out.println(mojaLista);
        System.out.println(observableList);
    }
}
