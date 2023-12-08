package Homework_21;

public class Dog {
    private String name;
    private static int counter = 0; // Статическое поле для отслеживания количества созданных объектов

    // Конструктор класса
    public Dog(String name) {
        this.name = name;
        counter++; // Увеличиваем счетчик при создании нового объекта
    }

    // Геттер для получения значения счетчика
    public static int getCounter() {
        return counter;
    }

    // Геттер для получения имени собаки
    public String getName() {
        return name;
    }
}

