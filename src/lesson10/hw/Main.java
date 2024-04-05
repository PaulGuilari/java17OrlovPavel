package lesson10.hw;
//I create a class Main, where in the main method,
// I output the number of paws of the Dog object
// and call the sleep method of the Hamster class.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Pes");
        System.out.println(dog.getPAW());
        Hamster hamster = new Hamster("Bob");
        hamster.sleep();
    }
}
