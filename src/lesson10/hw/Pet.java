package lesson10.hw;
//I create a class Pet, which is a child class of the Animal class.
// When its constructor is called, it should print "I am Pet" on the screen,
// and the variable "eyes" should be assigned the value 2.
// Additionally, in the Pet class, I add variables "name" and "tail", where "tail" should equal 1.
// Also, I create a field called "paw", which will be equal to 4.
// I create a method "run", which will print the message "Pet runs" on the screen,
// and a method "jump", which will print "Pet jumps".
public class Pet extends Animal{
    private String name;
    private final int TAIL = 1;
    private final int PAW = 4;

    public String getName() {
        return name;
    }

    public int getTAIL() {
        return TAIL;
    }

    public int getPAW() {
        return PAW;
    }

    public Pet() {
        this.setEyes(2);
        System.out.println("I am Pet");
    }

    public Pet(String name) {
        this.name = name;
    }

    void run(){
        System.out.println("Pet runs");
    }
    void jump(){
        System.out.println("Pet jumps");
    }

}
