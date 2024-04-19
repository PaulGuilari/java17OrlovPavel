package lesoon13.hw;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден: " + e.getMessage());
        }

        String str = null;
        printObject(str);


        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2};
        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(div(5, 0));
    }

    public static int div(int a, int b) {
        int i = 0;
        try {
            i = a / b;
        } catch (ArithmeticException ae) {
            System.out.println("division by zero is impossible");
        }
        return i;
    }

    public static void printObject(Object o) {
        try {
            System.out.println(o.toString());
        } catch (NullPointerException n) {
            System.out.println("The object can't be null");
        }
    }

}

