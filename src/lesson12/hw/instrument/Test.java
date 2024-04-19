package lesson12.hw.instrument;
/*
 * Создать массив типа Инструмент, содержащий инструменты разного типа.
 * В цикле вызвать метод play() для каждого инструмента,
 * который должен выводить строку "Играет такой-то инструмент, с такими-то характеристиками"
 */

public class Test {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(6);
        Guitar guitar2 = new Guitar(7);
        Drum drum1 = new Drum(1150);
        Drum drum2 = new Drum(1298);
        Trumpet trumpet1 = new Trumpet(3.66);
        Trumpet trumpet2 = new Trumpet(3.80);


        Instrument[] instruments = {guitar1, guitar2, drum1, drum2, trumpet1, trumpet2};
        for (var instrument : instruments) {
            instrument.play();
        }
    }
}
