package lesson22.hw;

public class Human {
    private final Months months;
    private final String name;

    public Human(Months months, String name) {
        this.months = months;
        this.name = name;
    }

    public Months getMonths() {
        return months;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human: " +
                "months: " + months +
                " name: " + name + "\n";
    }
}
