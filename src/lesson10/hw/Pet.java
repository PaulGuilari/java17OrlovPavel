package lesson10.hw;

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
