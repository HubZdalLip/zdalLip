package weekend7.mockexam.task3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("Klawisz.fxml"));
        primaryStage.setTitle("Klawisz");
        primaryStage.setScene(new Scene(parent,700,700));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
