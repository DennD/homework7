package ru.geekbrains.oskindi;

public class Cat {

    private String name;
    private int appetite;
    private boolean isFullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() > appetite) {
            p.decreaseFood(appetite);
            isFullness = true;
        }
    }

    public void info() {
        System.out.printf("Кот - %s. Сытость - %b\n", name, isFullness);
    }
}
