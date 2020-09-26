package weekend6.sample2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ColorController implements Initializable {

    @FXML
    private Slider redSlider;

    @FXML
    private Slider greenSlider;

    @FXML
    private Slider blueSlider;

    @FXML
    private TextField tfRed;

    @FXML
    private TextField tfGreen;

    @FXML
    private TextField tfBlue;

    @FXML
    private Rectangle rectangle;

    @FXML
    private Button btnChooseColor;

    private static final String INIT_RED = "59";
    private static final String INIT_GREEN = "89";
    private static final String INIT_BLUE = "70";

    private int red = Integer.parseInt(INIT_RED);
    private int green = Integer.parseInt(INIT_GREEN);
    private int blue = Integer.parseInt(INIT_BLUE);
    private Color paintColor;
    private Scene scene;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        #3b5946
//        red - 3b      => 59     3*16+11 = 59
//        green - 59    => 89     5*16+9 = 89
//        blue - 46     => 70     4*16+6 = 70

        tfRed.setText(INIT_RED);
        tfGreen.setText(INIT_GREEN);
        tfBlue.setText(INIT_BLUE);
        redSlider.setValue(Double.parseDouble(INIT_RED));
        greenSlider.setValue(Double.parseDouble(INIT_GREEN));
        blueSlider.setValue(Double.parseDouble(INIT_BLUE));

        redSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            tfRed.setText(String.valueOf(newValue.intValue()));
            red = newValue.intValue();
            rectangle.setFill(Color.rgb(red, green, blue));
        });

        greenSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            tfGreen.setText(String.valueOf(newValue.intValue()));
            green = newValue.intValue();
            rectangle.setFill(Color.rgb(red, green, blue));
        });

        blueSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            tfBlue.setText(String.valueOf(newValue.intValue()));
            blue = newValue.intValue();
            rectangle.setFill(Color.rgb(red, green, blue));
        });
    }

    @FXML
    void chooseColor(ActionEvent event) {
        paintColor = Color.rgb(red, green, blue);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();        //odwoluje sie do stage na ktorym pracuje
        scene.setUserData(paintColor);          //ustawiam scence dane
        stage.setScene(scene);                  //usatwiam scenke na stagu
        stage.show();

    }


    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void sendColor(Color color) {
        this.paintColor = color;
    }
}
