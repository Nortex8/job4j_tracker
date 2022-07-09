package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит по воздуху.");
    }

    @Override
    public void price() {
        System.out.println(getClass().getSimpleName() + " стоит 10 млн. долларов.");
    }
}
