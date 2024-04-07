package lesson11.hw;

/*
* переопределите метод printInfo()
* и go() в трех разных подклассах.
Например: Plane
* */
public class Plane extends Transport {
    @Override
    public void printInfo() {
        System.out.println("thi is a plane");
    }

    @Override
    public void go() {
        System.out.println("The plain's speed range is 100 - 1000");
    }
}
