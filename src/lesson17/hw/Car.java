package lesson17.hw;

/*
 * Создать класс Car. Добавить поля name и age. Имплементировать интерфейс Comparable и
 * переопределить метод compareTo так, чтобы наивысший приоритет был у минимального элемента
 * */
public class Car implements Comparable<Car> {
    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Car o) {
        return (this.age - o.age);
    }

    @Override
    public String toString() {
        return "\n" + "Car {" +
                "name = '" + name + '\'' +
                ", age = " + age + '}' + "\n";
    }
}
