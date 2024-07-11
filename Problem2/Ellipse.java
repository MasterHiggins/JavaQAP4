package Problem2;

public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    public Ellipse(double a, double b) {
        super("Ellipse");
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public void scale(double scaleFactor) {
        a *= scaleFactor;
        b *= scaleFactor;
    }
}
