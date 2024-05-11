package lesson19.hw;

public class Test {


    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.delete((Integer) 2);

        myList.display();
    }

}
