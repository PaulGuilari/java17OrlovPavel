package lesson14.hw;

/*
 * Создайте 2 исключения. Первое будет являтся дочерним классом класса RuntimeException
 * и в нем создайте конструктор, который принимает 1 параметр String и передает его в конструктор super класса.
 * Первое исключение называется NotFuelException.
 * */
public class NotFuelException extends RuntimeException {

    private String message;
    private int fuelLevel;

    public NotFuelException(int fuelLevel) {
        super("Fuel level is " + fuelLevel);
    }


}
