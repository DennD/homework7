package ru.geekbrains.oskindi;

public class Plate {
    private int capasity = 100;
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int capasity, int food) {
        this.capasity = capasity;
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
        if (food < 0) {
            food = 0;
        }
    }

    public void info() {
        System.out.println("Еды в тарелке " + food);
    }

    public void fillFood(int n) {
        food += n;
        if (food > capasity) {
            food = capasity;
        }
    }
}
