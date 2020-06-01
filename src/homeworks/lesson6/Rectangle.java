package homeworks.lesson6;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int calculatePerimeter() {
        return 2 * height + 2 * width;
    }

    public int calculateArea() {
        return height * width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            System.err.println("The height should be positive: " + height);
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.err.println("The width should be positive: " + width);
            return;
        }
        this.width = width;
    }
}
