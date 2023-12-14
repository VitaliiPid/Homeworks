package Homework_25;

public class Transport {
    private String model;
    private String manufacturer;
    private int year;
    private String color;
    private String owner;

    public Transport(String model,
                     String manufacturer,
                     int year,
                     String color,
                     String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.owner = owner;
    }

    public void move() {
        System.out.println("Транспорт движется.");
    }

    public void stop() {
        System.out.println("Транспорт остановлен.");
    }

    public String getOwner() {
        return "Владелец: " + owner;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Транспорт{" +
                "модель = " + model +
                ", производитель =" + manufacturer +
                ", год =" + year +
                ", цвет = " + color +
                ", владелец= " + owner +
                '}';
    }
}