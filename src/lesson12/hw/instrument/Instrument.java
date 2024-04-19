package lesson12.hw.instrument;
/*
 * Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
 * Интерфейс Инструмент содержит метод play() и переменную String KEY = "До мажор".
 */

public interface Instrument {
    String KEY = "C";

    void play();
}
