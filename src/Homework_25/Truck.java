package Homework_25;

public class Truck extends Transport{
    private int maxWeight;
    private int currentWeight = 0;
    private int currentFuel = 0;
    private int maxFuel;

    public Truck(String model,
                 String manufacturer,
                 int year,
                 String color,
                 int maxWeight,
                 int maxFuel,
                 String owner) {
        super(model, manufacturer, year, color, owner);
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
    }

    public void load(int weight) {
        if (weight > getRemainingCapacity()) {
            System.out.println("Перегруз транспорта! Невозможно продолжить");
            printRemainingCapacity();
            return;
        }

        currentWeight += weight;
        System.out.println("Загрузка " + weight + " кг......");
        System.out.println("Загружено " + weight + " кг.");
        printRemainingCapacity();
    }

    public void unload(int unloadingWeight) {
        if (unloadingWeight > currentWeight) {
            System.out.println("Недостаточно груза!");
            printRemainingCargo();
            return;
        }

        if (unloadingWeight < 0) {
            System.out.println("Невозможно разгрузить отрицательный вес");
            return;
        }

        currentWeight -= unloadingWeight;
        System.out.println("Разгрузка " + unloadingWeight + " кг....");
        System.out.println("Разгружено " + unloadingWeight + " кг.");
        printRemainingCargo();
    }

    private void printRemainingCargo() {
        System.out.println("Оставшийся вес груза: " + currentWeight + " кг");
    }

    private void printRemainingCapacity() {
        System.out.println("Оставшаяся грузоподъемность " + getRemainingCapacity() + " кг");
    }

    private int getRemainingCapacity() {
        return maxWeight - currentWeight;
    }

    public void move() {
        if (currentFuel == 0) {
            System.out.println("Недостаточно топлива, невозможно двигаться");
            return;
        }

        if (currentWeight == 0) {
            System.out.println("Пожалуйста, загрузите грузовик перед движением!");
            return;
        }

        super.move();
        System.out.println("Грузовик двигается!");
    }

    public void stop() {
        super.stop();
        System.out.println("Грузовик остановлен.");
    }
}