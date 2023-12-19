package Homework_29;

public class Money {
    private double amount; // Сумма денег
    private String currency; // Валюта

    // Конструктор для создания объекта Money
    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Геттер для получения суммы денег
    public double getAmount() {
        return amount;
    }

    // Геттер для получения валюты
    public String getCurrency() {
        return currency;
    }
}
