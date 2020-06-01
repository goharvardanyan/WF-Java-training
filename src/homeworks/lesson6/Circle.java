package homeworks.lesson6;

public class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            System.err.println("The radius should be positive: " + radius);
            return;
        }
        this.radius = radius;
    }
}
