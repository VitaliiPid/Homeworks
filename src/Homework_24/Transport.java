package Homework_24;

public class Transport {

    private String brand;
    private String model;

    public Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }
}
