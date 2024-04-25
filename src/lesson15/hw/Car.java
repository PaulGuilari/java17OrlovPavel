package lesson15.hw;
/*
 * Создать класс Car. Создать в нем поля: mark, age, color, owner.
 * */

public class Car {
    private final String mark;
    private final int age;
    private final String color;
    private final Owner owner;

    public Car(String mark, int age, String color, Owner owner) {
        this.mark = mark;
        this.age = age;
        this.color = color;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car: " + "\n" +
                "mark: '" + mark + "\n" +
                "age: " + age + "\n" +
                "color: '" + color + "\n" +
                "owner: " + owner;
    }
}
