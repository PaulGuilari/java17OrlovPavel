package lesson10.hw;
//I create a class Dog, which is a child class of the Pet class.
// When its constructor is called with the parameter name,
// it should print the message "I am dog and my name is: " followed by the name.
// Additionally, I add a method called "play", which will print the message "Dog plays" on the screen.

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: " + name);
    }

    void play(){
        System.out.println("Dog plays");
    }
}
