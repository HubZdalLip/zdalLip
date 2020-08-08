package weekend3;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // generowanie szybkie... alt+insert...

    public static double distance(Point point1, Point point2) {
        int point1X = point1.x;
        int point2X = point2.x;
        int point1Y = point1.y;
        int point2Y = point2.y;

        double distance = Math.sqrt(Math.pow(point1X - point2X, 2) + Math.pow(point1Y - point2Y, 2));

        return distance;
    }

    public void showX(){
        int x = 0;
        System.out.println(this.x);
    }


}
