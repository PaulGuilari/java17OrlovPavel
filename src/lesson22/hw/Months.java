package lesson22.hw;

public enum Months {

    JAN(31, "January"),
    FEB(28, "February"),
    MAR(31, "March"),
    APR(30, "April"),
    MAY(31, "May"),
    JUN(30, "June"),
    JUL(31, "July"),
    AUG(31, "August"),
    SEP(30, "September"),
    OCT(31, "October"),
    NOV(30, "November"),
    DEC(31, "December");

    private final int amountOfDays;

    private final String name;

    Months(int amountOfDays, String name) {
        this.amountOfDays = amountOfDays;
        this.name = name;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public String getName() {
        return name;
    }

}
