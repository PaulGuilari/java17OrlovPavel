package lesson12.hw.print;
/*
 * Определить класс Magazine, реализующий интерфейс Printable.
 * Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
 * который выводит на консоль названия только журналов.
 */

public class Magazine implements Printable {
    private final String name;

    public Magazine(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable) {
        for (var printers : printable) {
            if (printers instanceof Magazine) {
                printers.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("This is a magazine: " + name);
    }


}
