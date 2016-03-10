package p3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by mfiehl on 3/10/2016.
 */
public class Demo3 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);
        //circle.setRadius(50);
        circle.setStroke(Color.BLUEVIOLET);
        circle.setFill(Color.BEIGE);

        Circle circle2 = new Circle(200, 200, 50);

        Pane pane = new Pane();
        //pane.getChildren().add(circle);
        //pane.getChildren().add(circle2);
        pane.getChildren().addAll(circle, circle2);

        Scene scene = new Scene(pane,200,200);

        primaryStage.setTitle("My third JavaFX Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
