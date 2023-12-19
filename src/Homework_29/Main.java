package Homework_29;

public class Main {

    /*
    Задача 1
    С использованием агрегации (HAS-A relationship) создать классы Кошелек ( Wallet ) и Деньги ( Money).
    Вывести на печать несколько обьектов класса Wallet
     */
    public static void main(String[] args) {
        // Создание объектов Money
        Money money1 = new Money(100.0, "USD");
        Money money2 = new Money(50.0, "EUR");

        // Создание объекта Wallet
        Wallet wallet = new Wallet();

        // Добавление объектов Money в кошелек
        wallet.addMoney(money1);
        wallet.addMoney(money2);

        // Получение массива объектов Money из кошелька
        Money[] moneyArray = wallet.getMoneyArray();

        // Вывод информации о каждом объекте Money
        for (Money money : moneyArray) {
            System.out.println("Amount: " + money.getAmount() + " " + money.getCurrency());
        }
    }
}
