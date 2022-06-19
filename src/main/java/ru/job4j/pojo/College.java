package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Petr Ivanov");
        student.setGroup("320");
        student.setDateOfEntry("03.04.22");

        System.out.println(student.getName() + ", date of entry: " + student.getDateOfEntry() + " to the group " + student.getGroup());
    }
}
