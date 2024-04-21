package lesson14.hw;
/*
 * Первый метод drive будет иметь тип данных void и параметр int.
 * Если данный параметр равен нулю, то пусть выбрасывается исключение NotFuelException.
 * Второй метод safetyBelt пусть принимает String и если в строке будет значение "Not Belt",
 * то пусть выбрасывается NotBeltException. Если нет, то пусть выводит сообщение "Car is running"
 * */

public class Run {
    public static void main(String[] args) throws NotBeltException {
        Car car = new Car("Porche", "Grey", 40);
        car.drive(0);
        car.safetyBelt(true);
    }



}
