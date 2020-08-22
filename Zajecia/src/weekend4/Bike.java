package weekend4;

public class Bike implements Vehicle{
    @Override
    public void run() {
        System.out.println("Im riding a bike");
    }

    @Override
    public void stop() {
        System.out.println("I am stoping my bike");
    }
}
