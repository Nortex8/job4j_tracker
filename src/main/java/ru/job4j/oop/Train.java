package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " громко едет по рельсам.");
    }

    @Override
    public void price() {
        System.out.println(getClass().getSimpleName() + " стоит 1 млн. долларов.");
    }
}
