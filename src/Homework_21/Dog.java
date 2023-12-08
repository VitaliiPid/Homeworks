package Homework_21;

public class Dog {
    private String name;
    private static int counter = 0;

    public Dog(String name) {
        this.name = name;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }
}

