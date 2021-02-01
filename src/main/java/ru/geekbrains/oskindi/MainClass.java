package ru.geekbrains.oskindi;

public class MainClass {

    public static void main(String[] args) {
        Cat[] cat = {new Cat("Barsik", 25), new Cat("Mursik", 20), new Cat("Leopold",10),new Cat("Markis",25)};
        Plate plate = new Plate(100, 60);
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].info();
        }
        plate.info();
        plate.fillFood(40);
        plate.info();
    }
}
