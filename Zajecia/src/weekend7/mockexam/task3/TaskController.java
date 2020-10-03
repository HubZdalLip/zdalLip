package weekend7.mockexam.task3;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class TaskController implements Initializable {

    @FXML
    private Pane paneId;

    @FXML
    private Button btnId;

    @FXML
    private Slider sliderV;

    @FXML
    private Slider sliderH;
    private double v;
    private double h;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sliderH.setMax(paneId.getPrefWidth() - btnId.getPrefWidth());
        sliderV.setMax(paneId.getPrefHeight() - btnId.getPrefHeight());

        sliderV.valueProperty().addListener((observable, oldValue, newValue) -> {
            v = newValue.doubleValue();
            btnId.setLayoutY(paneId.getPrefHeight() - v - btnId.getPrefHeight());
            btnId.setText(String.format("%.2f , %.2f", v, h));
        });

        sliderH.valueProperty().addListener((observable, oldValue, newValue) -> {
            h = newValue.doubleValue();
            btnId.setLayoutX(h);
            btnId.setText(String.format("%.2f , %.2f", v, h));
        });
    }
}

