
package javafxapplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JavaFXApplication2 extends Application {
    Button btn;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("App name");
        StackPane layout = new StackPane();
        btn = new Button();
        btn.setText("start");
        layout.getChildren().add(btn);
        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
