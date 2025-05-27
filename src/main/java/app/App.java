package app;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        List<Integer> lista3 = new ArrayList<Integer>();
        lista3.addAll(List.of(10,10,10));
        ObservableList<Integer> oblist3 = FXCollections.observableArrayList(lista3);
        oblist3.addListener(new ListChangeListener<Integer>() {
            @Override
            public void onChanged(Change<? extends Integer> change) {
                System.out.println("promena na listi");
                while (change.next()){
                    if(change.wasAdded()){
                        System.out.println("dodati :" + change.getAddedSubList());
                    }
                    if(change.wasRemoved()){
                        System.out.println("removed : " + change.getRemoved());
                    }
                }
            }
        });
        oblist3.addAll(List.of(30,3));
        oblist3.remove(3);
        lista3.add(9);
        lista3.add(10);
        lista3.removeAll(List.of(10,30));
        System.out.println(oblist3);
        System.out.println(lista3);
    }
}
