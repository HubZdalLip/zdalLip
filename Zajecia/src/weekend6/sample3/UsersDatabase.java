package weekend6.sample3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersDatabase {
    private static List<User> userList = new ArrayList<>();

    public void addToList(User user) {
        if (user != null) {
            userList.add(user);
        }
    }

    public String selectUserWhere(String login, String password) {
        boolean anyMatch = userList.stream()
                .anyMatch(s -> s.getLogin().equals(login));

        if (!anyMatch) {
            return "Nie ma takiej osoby w bazie";
        }

        Optional<User> first = userList.stream()
                .filter(s -> s.getLogin().equals(login) && s.getPassword().equals(password))
                .findFirst();

        if(first.isPresent()){
            return "Użytkwonik "+ login + " znaleziony";
        }else {
            return "Hasło błedne";
        }
    }
}
