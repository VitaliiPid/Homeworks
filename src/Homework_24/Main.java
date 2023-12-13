package Homework_24;

public class Main {

    /*
    Task 1
    Написать как минимум одну иерархию классов в которой будет один родительский класс и два наследника,
    расширяющих его функционал
     */

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4);
        car.start();
        car.stop();

        Moto motorcycle = new Moto("Harley-Davidson", "Sportster", "Gasoline");
        motorcycle.start();
        motorcycle.stop();
    }
}
