package lesson11.hw;
/*
* переопределите метод printInfo()
* и go() в трех разных подклассах.
Например: Truck
* */
public class Truck extends Transport{
    @Override
    public void printInfo() {
        System.out.println("this is a truck");
    }

    @Override
    public void go() {
        System.out.println("The truck's speed range is 0 - 180");
    }
}
