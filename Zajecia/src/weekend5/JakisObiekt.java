package weekend5;

public class JakisObiekt {
    private String name;
    private int value;

    public JakisObiekt(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "JakisObiekt{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
