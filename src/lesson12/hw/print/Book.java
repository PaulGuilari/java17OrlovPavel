package lesson12.hw.print;
/*
 * Определить класс Book, реализующий интерфейс Printable.
 * Создать статический метод printBooks(Printable[] printable) в классе Book,
 * который выводит на консоль названия только книг. Используем оператор instanceof.
 * */

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("This is a book: " + name);
    }

    public static void printMagazines(Printable[] printable) {
        for (var printers : printable) {
            if (printers instanceof Book) {
                printers.print();
            }
        }
    }
}
