package ru.job4j.oop;

public class CommonType {
    public static void main(String[] args) {
        Vehicle airplane00 = new Airplane();
        Vehicle airplane01 = new Airplane();
        Vehicle bus00 = new Bus();
        Vehicle bus01 = new Bus();
        Vehicle train00 = new Train();
        Vehicle train01 = new Train();
        Vehicle[] vehicles = new Vehicle[]{airplane00, airplane01, bus00, bus01, train00, train01};
        for (Vehicle a : vehicles) {
            a.move();
            a.price();
            System.out.println();
        }
    }
}




