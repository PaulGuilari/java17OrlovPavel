package lesson12.hw.instrument;
/*
* Барабан содержит переменную размер
*/

public class Drum implements Instrument {
    private final int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Now the drum is playing, the key is " + KEY + ". The drum has " + size + " mm size");
    }
}
