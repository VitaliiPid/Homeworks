package Homework_24;

public class Car extends Transport{
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void start() {
        super.start();
        System.out.println("Number of doors: " + numberOfDoors);
    }

    public void stop() {
        super.stop();
        System.out.println("Number of doors: " + numberOfDoors);

    }
}
