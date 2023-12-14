package Homework_25;

public class Main {
    public static void main(String[] args) {
        // Пример использования класса Truck
        Truck truck = new Truck("HeavyTruck", "Manufacturer1", 2022, "Blue", 5000, 200, "John Doe");
        truck.load(3000);
        truck.move();
        truck.unload(1000);
        truck.stop();

        // Пример использования класса PassengerCar
        PassengerCar passengerCar = new PassengerCar("Sedan", "Manufacturer2", 2022, "Black", 4, "Jane Doe");
        passengerCar.pickUpPassengers(3);
        passengerCar.move();
        passengerCar.stop();
    }
}