package Homework_25;

public class PassengerCar extends Transport{
    private int passengerCapacity;

    public PassengerCar(String model,
                        String manufacturer,
                        int year,
                        String color,
                        int passengerCapacity,
                        String owner) {
        super(model, manufacturer, year, color, owner);
        this.passengerCapacity = passengerCapacity;
    }

    public void pickUpPassengers(int passengers) {
        if (passengers < 0) {
            System.out.println("Невозможно взять отрицательное количество пассажиров");
            return;
        }

        System.out.println("Забираем " + passengers + " пассажиров...");
        System.out.println("Пассажиры взяты, текущая вместимость: " + passengers + " пассажиров.");
        printRemainingPassengerCapacity();
    }

    private void printRemainingPassengerCapacity() {
        int remainingCapacity = passengerCapacity - getPassengerCount();
        System.out.println("Остаточная вместимость пассажиров: " + remainingCapacity + " человек");
    }

    private int getPassengerCount() {
        return 0;
    }

    public void move() {
        super.move();
        System.out.println("Легковой автомобиль движется!");
    }

    public void stop() {
        super.stop();
        System.out.println("Легковой автомобиль остановлен.");
    }
}
