package lesson11.hw;
/*
* переопределите метод printInfo()
* и go() в трех разных подклассах.
Например: Car
* В этом классе перегрузите метод calculateDistance(),
* который может принимать либо сразу дистанцию int dist,
* либо принимать (скорость, время) и результат будет dist = v * s
*
* */
public class Car extends Transport{
    private int v;
    private int s;
    private int dist;
    @Override
    public void printInfo() {
        System.out.println("this is a car");
    }

    @Override
    public void go() {
        System.out.println("The car's speed range is 0 - 200");

    }

    public void calculateDistance (int v, int s){
        System.out.println("Distance = " + (v * s));
    }

    public void calculateDistance(int d){
        dist = d;
        System.out.println("Distance = " + dist);
    }

}
