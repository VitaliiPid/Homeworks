package Homework_24;

public class Moto extends Transport{
    private String engineType;

    public Moto(String brand, String model, String engineType) {
        super(brand, model);
        this.engineType = engineType;
    }

}
