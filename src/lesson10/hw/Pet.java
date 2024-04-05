package lesson10.hw;
//Pet is the child class of the Animal and parent clas fot the dog & hamster.
public class Pet extends Animal{
    String name;
    final int TAIL = 1;
    final int PAW = 4;
    public Pet(String eyes) {
        this.eyes = eyes;
        System.out.println("I am Pet");
    }
    void run(){
        System.out.println("Pet runs");
    }
    void jump(){
        System.out.println("Pet jumps");
    }

}
