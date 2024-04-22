package lesson14.hw;
/* * Создать класс Car. Создать аттрибуты name, color и fuelLevel.
 * Первый метод drive будет иметь тип данных void и параметр int.
 * Если данный параметр равен нулю, то пусть выбрасывается исключение NotFuelException.
 * Второй метод safetyBelt пусть принимает boolean и если будет значение false,
 * то пусть выбрасывается NotBeltException. Если нет, то пусть выводит сообщение "Car is running"
 * */

public class Car {
    private final String name;
    private final String color;
    private final int fuelLevel;

    public Car(String name, String color, int fuelLevel) {
        this.name = name;
        this.color = color;
        this.fuelLevel = fuelLevel;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void drive() {
        if (fuelLevel == 0) {
            throw new NotFuelException(fuelLevel);
        }
    }

    public void safetyBelt(boolean isBelt) throws NotBeltException {
        if (isBelt) {
            System.out.println("Car is running");
        } else throw new NotBeltException("Not Belt");
    }

}
