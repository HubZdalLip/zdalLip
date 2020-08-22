package weekend4;

public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("Im driving a car");
    }

    @Override
    public void stop() {
        System.out.println("I am stoping my car");
    }
}
