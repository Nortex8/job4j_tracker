package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if(position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }
        else if(position == 2) {
            System.out.println("Спокойной ночи");
        }
        else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox petya = new Jukebox();
        int number;
        for (int i = 1; i < 4; i++) {
            number = i;
            petya.music(number);
        }
    }
}
