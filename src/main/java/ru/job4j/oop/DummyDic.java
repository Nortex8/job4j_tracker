package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic trl = new DummyDic();
        String eng = "Unbelievable";
        trl.engToRus(eng);
        System.out.println(trl.engToRus(eng));
    }
}
