package weekend4;

public class Skateboard implements Vehicle {
    @Override
    public void run() {
        System.out.println("Im running with my skateboard");
    }

    @Override
    public void stop() {
        System.out.println("I am stoping");
    }
}
