package Homework_21;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Tuzik");
        Dog dog2 = new Dog("Bobik");
        Dog dog3 = new Dog("Sharik");

        System.out.println("Количество созданных собак: " + Dog.getCounter());

        System.out.println("Собака 1: " + dog1.getName());
        System.out.println("Собака 2: " + dog2.getName());
        System.out.println("Собака 3: " + dog3.getName());
    }
}

