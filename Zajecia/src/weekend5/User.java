package weekend5;

import java.util.Objects;

public class User {
    private Long id;
    private String name;
    private String surname;
    private String pesel;

    public User(Long id, String name, String surname, String pesel) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(pesel, user.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, pesel);
    }
}
