package p6;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by mfiehl on 3/10/2016.
 */
public class Demo6 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.setHgap(10);
        pane.setVgap(10);

        // Define the text fields

        // First Name
        TextField tfFirstName = new TextField();

        // Middle Initial
        TextField tfMI = new TextField();

        // Last Name
        TextField tfLastName = new TextField();

        // Place the nodes in the pane
        pane.add(new Label("First Name:"), 0, 0);
        pane.add(tfFirstName, 1, 0);

        pane.add(new Label("MI:"), 0, 1);
        pane.add(tfMI, 1, 1);

        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(tfLastName, 1, 2);

        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);


        Scene scene = new Scene(pane,500,500);

        primaryStage.setTitle("My fourth JavaFX Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
