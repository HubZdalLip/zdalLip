package weekend6.sample3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLogin implements Initializable {

    @FXML
    private TextField tfLogin;

    @FXML
    private Button btnLogin;

    @FXML
    private Label info;

    @FXML

    private PasswordField tfPassword;
    private UsersDatabase usersDatabase;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        User user = new User("Tomek","12345");
        User user1 = new User("Natalia3","qwerty");
        usersDatabase = new UsersDatabase();
        usersDatabase.addToList(user);
        usersDatabase.addToList(user1);

        info.setVisible(false);
    }

    @FXML
    void submit(ActionEvent event) {
        String login = tfLogin.getText();
        String password = tfPassword.getText();
        check(login,password);
    }

    private void check(String login, String password) {
        info.setText(usersDatabase.selectUserWhere(login,password));
        info.setVisible(true);
    }

}
