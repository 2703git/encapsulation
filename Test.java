public class Test {
    public static void main(String[] args) {
        Car car = new Car("Black", "BMW", 25000, "Automatic");
        car.carInfo();

        RightTriangle triangle = new RightTriangle(3, 4);
        System.out.println(triangle);

        Point point = new Point(2, 5, 7);
        System.out.println(point);
    }
}
