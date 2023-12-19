package Homework_29;

public class Wallet {
    private Money[] moneyArray; // Массив объектов Money в кошельке
    private int size; // Текущий размер массива

    // Конструктор для создания объекта Wallet
    public Wallet() {
        this.moneyArray = new Money[10]; // Инициализация массива
        this.size = 0;
    }

    // Метод для добавления объекта Money в кошелек
    public void addMoney(Money money) {
        if (size < moneyArray.length) {
            moneyArray[size++] = money;
        } else {
            System.out.println("Wallet is full. Cannot add more money.");
        }
    }

    // Метод для получения массива объектов Money из кошелька
    public Money[] getMoneyArray() {
        Money[] result = new Money[size];
        System.arraycopy(moneyArray, 0, result, 0, size);
        return result;
    }
}