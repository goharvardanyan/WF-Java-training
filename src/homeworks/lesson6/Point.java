package homeworks.lesson6;

public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distance() {
        return Math.sqrt(coordinateX * coordinateX + coordinateY * coordinateY);
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.coordinateX - this.coordinateX, 2) + Math.pow(point.coordinateY - coordinateY, 2));
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}
