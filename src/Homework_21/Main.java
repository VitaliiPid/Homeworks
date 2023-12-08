package Homework_21;

public class Main {
    public static void main(String[] args) {
        // Создание нескольких объектов класса Dog
        Dog dog1 = new Dog("Tuzik");
        Dog dog2 = new Dog("Bobik");
        Dog dog3 = new Dog("Sharik");

        // Вывод количества созданных объектов
        System.out.println("Количество созданных собак: " + Dog.getCounter());

        // Дополнительная информация о каждой собаке
        System.out.println("Собака 1: " + dog1.getName());
        System.out.println("Собака 2: " + dog2.getName());
        System.out.println("Собака 3: " + dog3.getName());
    }
}

