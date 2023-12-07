package Homework_20;

public class Main {
    /*
    Создать класс грузовик Truck, содержащий общие характеристики грузовиков:
    model, manufacturer,year (год выпуска),colour,maxWeight (грузоподьемность),
    maxFuel (обьем топливного бака), имя владельца и имеющий следующее поведение:
    1. Должен уметь загружаться (load) и при этом сообщать, если превышена его грузоподьемность,
       а также сообщать сколько еще можно загрузить груза
    3. В случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
    5. Уметь сообщать имя владельца
     */
    public static void main(String[] args) {

        Truck truck1 = new Truck("Volvo", "Volvo Group", 2022,
                        "Blue", 5000, 200, "John Smith");

        Truck truck2 = new Truck("MAN", "MAN Truck & Bus", 2021,
                        "Red", 6000, 250, "Jane Smith");

        truck1.load(3000); // возможность загрузки
        truck1.drive(); // возможность ехать
        truck1.refuel(50); // возможность заправки топливом
        truck1.printOwner(); // имя владельца

        System.out.println();

        truck2.load(7000);
        truck2.drive();
        truck2.refuel(150);
        truck2.printOwner();
    }
}
