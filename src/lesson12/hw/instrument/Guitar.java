package lesson12.hw.instrument;
/*
 * Гитара содержит переменную класса количествоСтрун
 */

public class Guitar implements Instrument {
    private int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Now the guitar is playing in key: " + KEY + " ,this guitar has " + strings + " strings");
    }
}
