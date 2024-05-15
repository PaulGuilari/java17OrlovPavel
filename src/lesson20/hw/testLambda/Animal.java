package lesson20.hw.testLambda;
/*
* Создаём класс Animal с темя полями (name (String), canHop (boolean), canSwim (boolean))
* Необходимо создать два метода с возвращаемым типом boolean
* */

public class Animal {
    private String name;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String name, boolean canHop, boolean canSwim) {
        this.name = name;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop(){
        return canHop;
    }

    public boolean canSwim(){
        return canSwim;
    }

    @Override
    public String toString() {
        return name;
    }
}
