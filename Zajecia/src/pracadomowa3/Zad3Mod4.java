package pracadomowa3;

public class Zad3Mod4 {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);
         //dostaję ten sam obiekt...
        SingletonClass singletonClass1 = SingletonClass.getInstance();

    }

}

class SingletonClass {
    private static SingletonClass singletonClass;

    //prywatny konstruktor
    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
            return singletonClass;
        }
        System.out.println("Obiekt już istnieje....");
        return singletonClass;
    }
}
