package weekend6.sample2;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class PaintingController {

    @FXML
    private Button chooseColorBtn;

    @FXML
    private Button undoBtn;

    @FXML
    private Button clearBtn;

    @FXML
    private RadioButton smallRadioBtn;

    @FXML
    private ToggleGroup sizeToggleGroup;

    @FXML
    private RadioButton medRadioBtn;

    @FXML
    private RadioButton largeRadioBtn;

    @FXML
    private Pane paintingPane;

    private Size size;
    private Color color;
    private Scene scene;

    public void initialize() {
        smallRadioBtn.setUserData(Size.SMALL);      //ustawiam dane pod radiobuttony
        medRadioBtn.setUserData(Size.MEDIUM);
        largeRadioBtn.setUserData(Size.LARGE);
        size = Size.SMALL;
    }

    @FXML
    void chooseColor(ActionEvent event) throws IOException {
        changeWindow(event);
    }

    private void changeWindow(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();       // zgarniam źródło wydarzenia
        scene = node.getScene();              // na podstawie źrodła wnioskuje scenkę
        Stage stage = (Stage) scene.getWindow();    // mając scenkę odwołuję się do stage

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("color.fxml"));           // pobieram obiekt fxmlloader za pomcoa ktorego bede chcial zaladowac strukture z fxml color.fxml
        Parent parent = fxmlLoader.load();

        ColorController colorController = fxmlLoader.getController();           //zgarniam kontroler
        colorController.setScene(scene);        // wysylam obecna scene
        colorController.sendColor(color);       // wysylam kolor do modyfikacji

        Scene sceneColor = new Scene(parent, 780, 490);     //tworze nowa scene dla wybrania koloru wysylac strukture fxml
        stage.setScene(sceneColor);     //ustwiam scenke
        stage.show();           //wyswietlam okno
    }

    @FXML
    void chooseSize(ActionEvent event) {
        size = (Size) sizeToggleGroup.getSelectedToggle().getUserData();        // odwoluje sie do grupy okreslonej dla rozmiaru (w scenebuilderze kazdy rozmair ma te sama grupe)
        //nastepnei zbieram wybrany element i zgarniam z niego dane
    }

    @FXML
    void clear(ActionEvent event) {
        paintingPane.getChildren().clear();
    }

    @FXML
    void undo(ActionEvent event) {
        if (!paintingPane.getChildren().isEmpty()) {
            paintingPane.getChildren().remove(paintingPane.getChildren().size() - 1);
        }
    }

    @FXML
    void undoContinuously(MouseEvent event) {
        if (!paintingPane.getChildren().isEmpty()) {
            paintingPane.getChildren().remove(paintingPane.getChildren().size() - 1);
        }
    }

    @FXML
    void paint(MouseEvent event) { // okreslam akcje w przypadku rysowania
        if (scene != null) {
            color = (Color) scene.getUserData();
        }
        if (color == null) {
            color = Color.BLACK;
        }
        Circle circle = new Circle(event.getX(), event.getY(), size.getSize(), color); //tworze kolo o wspolrzednych takich gdzie event myszki zostal wywolany
        ObservableList<Node> children = paintingPane.getChildren();
        children.add(circle);
    }

    private enum Size {
        SMALL(4),
        MEDIUM(8),
        LARGE(12);

        private final int size;

        Size(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }
    }

}

