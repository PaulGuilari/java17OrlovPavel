package lesson10.hw;
// Create a class Animal.
// When its constructor is called, it should print "I am Animal" on the screen.
// Inside the class, create a variable called "eyes" and methods called "eat",
// which will print "Animal eats", and "drink", which will print "Animal drinks".

public class Animal {
    int eyes;
    String name;

    public Animal() {
        System.out.println("I am Animal");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animal drinks");
    }
}
