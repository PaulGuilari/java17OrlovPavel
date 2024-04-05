package lesson10.hw;
//I am creating a class Hamster, which is a child class of the Pet class.
// When its constructor is called with the parameter name,
// it should print the message "I am a hamster and my name is:" followed by the name.
// Additionally, I need to add a method called "sleep",
// which will print "Hamster is sleeping" on the screen.
public class Hamster extends Pet{

    public Hamster(String name){
        this.name = name;
        System.out.println("I am a hamster and my name is: " + name);
    }
    void sleep(){
        System.out.println("Hamster is sleeping");
    }
}
