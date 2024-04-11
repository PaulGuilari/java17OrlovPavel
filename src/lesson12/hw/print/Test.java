package lesson12.hw.print;

/*
 * Создать массив типа Printable, который будет содержать книги и журналы.
 * В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 */
public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Idiot");
        Book book2 = new Book("One Flew Over the Cuckoo's Nest");
        Magazine magazine1 = new Magazine("Burda");
        Magazine magazine2 = new Magazine("Rolling Stone");
        Printable[] printable = {book1, book2, magazine1, magazine2};
        for (var printer : printable) {
            printer.print();
        }
        Book.printMagazines(printable);
        Magazine.printMagazines(printable);
    }
}
