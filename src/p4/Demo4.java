package p4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by mfiehl on 3/10/2016.
 */
public class Demo4 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Circle circle = new Circle(50);
        circle.setStroke(Color.BLUEVIOLET);
        circle.setFill(Color.BEIGE);

        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        pane.getChildren().addAll(circle);

        Scene scene = new Scene(pane,500,500);

        primaryStage.setTitle("My fourth JavaFX Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
