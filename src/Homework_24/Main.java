package Homework_24;

public class Main {

    /*
    Task 1
    Написать как минимум одну иерархию классов в которой будет один родительский класс и два наследника,
    расширяющих его функционал

    Разработать классы для представления транспортных средств. Базовый класс Transport должен содержать
    информацию о марке и модели, а также методы start() и stop(). Реализовать подклассы: Car с информацией
    о количестве дверей и Moto с информацией о типе двигателя.
     */
        public static void main(String[] args) {
            Car car = new Car("Toyota", "Camry", 4);
            car.start();
            car.stop();

            Moto moto = new Moto("Harley-Davidson", "Sportster", "Gasoline");
            moto.start();
            moto.stop();
        }
}
