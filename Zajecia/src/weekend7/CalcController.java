package weekend7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class CalcController implements Initializable {

    @FXML
    private TextField resultTf;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMulti;

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnDot;

    @FXML
    private Button btn0;

    @FXML
    private Button btnResult;

    @FXML
    private Button btnPow;

    @FXML
    private Button btnSqrt;

//    private List<String> op;
    private String firstNumber;
    private String operation;
    private String secNumber;
    private boolean flag;

    @FXML
    void showResult(ActionEvent event) {
//        if (op.size() < 3) {
//            return;
//        }
//        String firstNumber = op.get(op.size() - 3);
//        String operation = op.get(op.size() - 2);
//        String secNumber = op.get(op.size() - 1);

        double result = doTask(firstNumber, operation, secNumber);
        resultTf.setText(String.format("%.2f", result));

    }

    private double doTask(String firstNumber, String operation, String secNumber) {
        if (firstNumber == null || operation == null || secNumber == null) {
            this.firstNumber = null;
            this.operation = null;
            this.secNumber = null;
            return 0;
        }

        double first = 0;
        double sec = 0;
        try {
            first = Double.parseDouble(firstNumber);
            sec = Double.parseDouble(secNumber);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        this.firstNumber = null;
        this.secNumber = null;
        this.operation = null;

        switch (operation) {
            case "+":
                return first + sec;
            case "-":
                return first - sec;
            case "*":
                return first * sec;
            case "/":
                if (sec != 0) {
                    return first / sec;
                } else {
                    return first;
                }
        }

        return 0;

    }

    @FXML
    void update(ActionEvent event) {
        String text = ((Button) event.getSource()).getText();       // uzyskujemy informacje na temat zrodla eventu i castujemy go do button

        if (Arrays.asList("+", "-", "*", "/", "=").contains(text)) {
            flag = false;
            if(firstNumber == null){
                firstNumber = resultTf.getText();
            }
        }

        if (!text.equals(".") && !resultTf.getText().endsWith(".") && !flag) {
            resultTf.setText(text);
        } else {
            flag = true;
            firstNumber = null;
            resultTf.setText(resultTf.getText() + text);
        }

        if (firstNumber == null && !flag) {
            firstNumber = text;
        } else if (operation == null && !flag) {
            operation = text;
        } else if(!flag){
            secNumber = text;
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        resultTf.setEditable(false);
    }
}
