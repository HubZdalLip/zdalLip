package weekend6.sample2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override                                   // zawsze musi wystapic przeslonieta metoda start ktora ma jako aprametr Stage
    public void start(Stage primaryStage) throws Exception{
        // Stage - scena, nowe okno, wszystko co sie dzieje na aktualnym oknie jest umieszczone na konkretnym stage
        // Scene - scenka, nakladka na stage, wszystkie kontrolki naleza do scenki
        // wszystkie elementy w javaFx sa utworzone w strukturze drzewiastej

        // przy wstrzykiwaniu klasa FXMLLoader otrzymujemy najwyzszy wezel
        Parent root = FXMLLoader.load(getClass().getResource("paint.fxml"));
        primaryStage.setTitle("Paint");
        Scene scene = new Scene(root,950,630);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
