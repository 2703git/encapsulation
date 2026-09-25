public class Car {
    private String color;
    private String model;
    private double price;
    private String autoOrManual;

    public Car(String color, String model, double price, String autoOrManual) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.autoOrManual = autoOrManual;
    }

    public void carInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("System: " + autoOrManual);
    }
}