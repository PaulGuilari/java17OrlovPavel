package lesson11.hw;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        car.printInfo();
        car.go();
        Car car2 = new Car();
        car2.calculateDistance(100,20);
        car2.calculateDistance(250);
        Transport plane = new Plane();
        plane.go();
        plane.printInfo();
        Transport truck = new Truck();
        truck.printInfo();
        truck.go();

    }
}
