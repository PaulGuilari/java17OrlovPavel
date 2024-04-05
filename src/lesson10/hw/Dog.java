package lesson10.hw;
//Dog class is the child class of the pet.

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        System.out.println( "I am dog and my name is: " + name);
    }
    void play(){
        System.out.println("Dog plays");
    }
}
