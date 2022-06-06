package ru.job4j.oop;

public class Student {

    public void bayan() {
        System.out.println("Play on bayan");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.bayan();
        }
        for (int i = 0; i < 3; i++) {
            petya.song();
        }
    }
}
