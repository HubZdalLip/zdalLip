package weekend6.sample3;

public class User {
    private static long idGenerator = 1L;
    private long id;
    private String login;
    private String password; // w rzeczywistosci char[]

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        id = idGenerator++;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
