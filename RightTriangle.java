public class RightTriangle {
    private double a;
    private double b;
    private double c;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a * a + b * b);
    }
    public double Area() {
        return 0.5 * a * b;
    }
    public double Perimeter() {
        return a + b + c;
    }
    public double Area(int a, int b) {
        return 0.5 * a * b;
    }
    public double Area(double a, double b) {
        return 0.5 * a * b;
    }
    public double Area(float a, float b) {
        return 0.5 * a * b;
    }
    public double Area(long a, long b) {
        return 0.5 * a * b;
    }
    public double Perimeter(int a, int b) {
        double c = Math.sqrt(a * a + b * b);
        return a + b + c;
    }
    public double Perimeter(double a, double b) {
        double c = Math.sqrt(a * a + b * b);
        return a + b + c;
    }
    public double Perimeter(float a, float b) {
        double c = Math.sqrt(a * a + b * b);
        return a + b + c;
    }
    public double Perimeter(long a, long b) {
        double c = Math.sqrt(a * a + b * b);
        return a + b + c;
    }
    public String toString() {
        return "Right triangle | a = " + a + ", b = " + b + ", c = " + c
                + "\nArea: " + Area()
                + "\nPerimeter: " + Perimeter();
    }
}