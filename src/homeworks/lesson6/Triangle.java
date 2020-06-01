package homeworks.lesson6;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double halfPerimeter = (double) (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <= 0) {
            System.err.println("The width should be positive: " + sideA);
            return;
        }
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB <= 0) {
            System.err.println("The width should be positive: " + sideB);
            return;
        }
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC <= 0) {
            System.err.println("The width should be positive: " + sideC);
            return;
        }
        this.sideC = sideC;
    }
}
