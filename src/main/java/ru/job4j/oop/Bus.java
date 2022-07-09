package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по автомагистрали.");
    }

    @Override
    public void price() {
        System.out.println(getClass().getSimpleName() + " стоит 100 тысяч долларов.");
    }
}
