package Homework_20;

public class Truck {
    private String model;
    private String manufacturer;
    private int year;
    private String colour;
    private double maxWeight;
    private double maxFuel;
    private String owner;
    private double currentWeight;
    private double currentFuel;

    // Конструктор класса
    public Truck(String model, String manufacturer, int year, String colour, double maxWeight, double maxFuel, String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
        this.currentWeight = 0;
        this.currentFuel = maxFuel;
    }

        public void load(double weight) {
        if (weight < 0) {
            System.out.println("Невозможно загрузить отрицательный груз.");
        } else if (currentWeight + weight > maxWeight) {
            System.out.println("Превышена грузоподъемность. Максимальный вес: " + maxWeight +
                    ", осталось места: " + (maxWeight - currentWeight));
        } else {
            currentWeight += weight;
            System.out.println("Груз успешно загружен. Осталось места: " + (maxWeight - currentWeight));
        }
    }

    public void drive() {
        if (currentFuel <= 0 || currentWeight <= 0) {
            System.out.println("Невозможно ехать. Проверьте топливо и наличие груза.");
        } else {
            System.out.println("Грузовик поехал.");
        }
    }

    public void refuel(double fuel) {
        if (fuel < 0) {
            System.out.println("Невозможно заправить отрицательное количество топлива.");
        } else if (currentFuel + fuel > maxFuel) {
            System.out.println("Превышен объем топливного бака. Максимальный объем: " + maxFuel +
                    ", осталось места: " + (maxFuel - currentFuel));
        } else {
            currentFuel += fuel;
            System.out.println("Топливо успешно заправлено. Осталось места: " + (maxFuel - currentFuel));
        }
    }

    public void printOwner() {
        System.out.println("Владелец грузовика: " + owner);
    }
}
