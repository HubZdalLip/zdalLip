package weekend6.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

//rozszerzenie initializable daje mozliwosc uzycia metody initialize dzieki ktorej mozemy ustawic stan poczatkowy
public class Controller implements Initializable {

    @FXML // adnotacja fxml informuje ze kontrlka jest wstrzyknieta
    private Label labelMoney;

    @FXML
    private Label labelTip;

    @FXML
    private Label labelPeople;

    @FXML
    private Label labelResult;

    @FXML
    private Label labelBtn;

    @FXML
    private TextField tfMoney;

    @FXML
    private TextField tfPeople;

    @FXML
    private TextField tfResult;

    @FXML
    private Button calcBtn;

    @FXML
    private Slider tipSlider;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tfResult.setEditable(false);
        tfMoney.setText("0");
        tfPeople.setText("0");

        //odwoluje sie wlasciwosci slidera. Nastepnie dodaje nasluchiwanie zmian za pomoca interfejsu ChangeListener w ktory okreslam akcje (metoda changed)
        tipSlider.valueProperty().addListener((observable, oldValue, newValue) -> labelTip.setText("Napiwek: " + newValue.intValue() + "%"));
    }

    @FXML
    void calculate(ActionEvent event) throws NumberFormatException {
        String moneyAsString = tfMoney.getText();
        String peopleAsString = tfPeople.getText();
        double money = Double.parseDouble(moneyAsString);
        int people = Integer.parseInt(peopleAsString);
        double tip = ((int) tipSlider.getValue()) / 100.0;

        double result = (money + money * tip) / people;

        if (money == 0 || people == 0) {
            return;
        }
        tfResult.setText(String.format("%.2f", result) + " zł");

    }

}
