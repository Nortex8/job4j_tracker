package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String TOMATO = "extra tomato";

    public String name() {
        return super.name() + " + " + TOMATO;
    }
}
