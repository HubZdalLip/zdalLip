package weekend3;

public class CarFactory {
    public static Car createCar(CarsEnum car) {
        switch (car) {
            case FORD: // nalezy dawac juz same stale enuma bez jego nazwy poniewaz nazwa enuma jest jednoznaczna po wrzuceniu go do switch()
                return new Car("ford");
            case BMW:
                return new Car("bmw");
        }
        return null;
    }
}
