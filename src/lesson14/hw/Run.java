package lesson14.hw;
/*
 * Первый метод drive будет иметь тип данных void и параметр int.
 * Если данный параметр равен нулю, то пусть выбрасывается исключение NotFuelException.
 * Второй метод safetyBelt пусть принимает String и если в строке будет значение "Not Belt",
 * то пусть выбрасывается NotBeltException. Если нет, то пусть выводит сообщение "Car is running"
 * */

public class Run {
    public static void main(String[] args) {
        Car car = new Car("Porche", "Grey", 50);

        try {
            car.drive();
        } catch (NotFuelException e) {
            System.out.println(e.getMessage());
        }
        try {
            car.safetyBelt(true);
        } catch (NotBeltException e) {
            System.out.println("The Belt is not fastened");
        }
    }


}
