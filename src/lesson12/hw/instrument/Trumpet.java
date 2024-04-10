package lesson12.hw.instrument;
/*
* Труба рсодержит переменную диамет
* */

public class Trumpet implements Instrument {
    private final double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Now the trumpet is playing in key: " + KEY + ", the trumpet has " +
                diameter + " mm diameter");
    }
}
