package Homework_23;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сложение двух чисел: " + Calculator.sum(6, 7));
        System.out.println("Сложение двух чисел (с запятой): " + Calculator.sum(6.5, 7.3));

        System.out.println("Вычитание двух чисел: " + Calculator.subtract(8, 3));
        System.out.println("Вычитание двух чисел (с запятой): " + Calculator.subtract(8.8, 3.3));

        System.out.println("Сложение трех чисел: " + Calculator.sum(2, 4, 6));
        System.out.println("Сложение трех чисел (с запятой): " + Calculator.sum(2.5, 4.3, 6.1));

        System.out.println("Вычитание трех чисел: " + Calculator.subtract(10, 3, 2));
        System.out.println("Вычитание трех чисел (с запятой): " + Calculator.subtract(10.5, 3.3, 2.1));
    }
}
