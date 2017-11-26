package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane menu = new StackPane();
        scene = new Scene(menu, 300, 300);
        menu.setStyle("-fx-background-color:rgb(7, 142, 150)");

        primaryStage.setTitle("Unfunny event manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
