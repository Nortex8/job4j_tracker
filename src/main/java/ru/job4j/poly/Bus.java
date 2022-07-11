package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Drive with fun.");
    }

    @Override
    public void passenger(int number) {
        System.out.println("Amount of passenger: " + number);
    }

    @Override
    public int fuel(int amountFuel) {
        int pricePerLiter = 60;
        return amountFuel * pricePerLiter;
    }
}
