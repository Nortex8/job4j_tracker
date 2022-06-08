package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Content of active: " + active);
        System.out.println("Amount: " + status);
        System.out.println("Sentence: " + message);
    }

    public Error() {
    }

    public static void main(String[] args) {
        Error error = new Error(true, 100, "Congratulation!");
        error.printInfo();
        Error er = new Error();
        er.printInfo();
    }
}
