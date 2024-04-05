package lesson10.hw;
//Hamster class is the child class of the pet.
public class Hamster extends Pet{

    public Hamster(String name){
        super(name);
        System.out.println("I am a hamster and my name is: " + name);
    }
    void sleep(){
        System.out.println("Hamster is sleeping");
    }
}
