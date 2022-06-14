package ru.job4j.oop;

public class Max {

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int forth) {
        return max(first, max(second, third, forth));
    }

    public static void main(String[] args) {
        Max mix = new Max();
        int a = mix.max(19, 22, 50, 100);
        System.out.println(a);
    }
}
