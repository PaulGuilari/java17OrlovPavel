package lesson14.hw;
/*
 * Второе пусть является дочерним классом класса Exception и называется NotBeltException.
 * Также пусть передает параметр String в конструктор super класс.а.
 * */

public class NotBeltException extends Exception {
    private String message;

    public NotBeltException(String message) {
        super("The Belt is not fastened");
    }
}
