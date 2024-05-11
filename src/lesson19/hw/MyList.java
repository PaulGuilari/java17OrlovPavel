package lesson19.hw;

/*
 * Создать свой класс MyList or MySet or MyQueue
 * Имплементировать методы().
 * Прописать бизнес логику в ваши методы.
 * Использовать методы класса MyList
 * */
public class MyList<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity can not be <= 0");
        } else list = (T[]) new Object[capacity];
    }

    public MyList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T item) {
        list[size++] = item;
    }

    public void add(int index, T item) {
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    public void delete(int index) {
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
    }

    public void delete(T item) {
        int pos = index(item);
        if (pos < 0) {
            return;
        }
        delete(pos);
    }

    private int index(T item) {
        if (item == null)
            return -1;
        for (int i = 0; i < size; i++) {
            if (item.equals(list[i]))
                return i;
        }
        return -1;
    }

    public void display() {
        for (T elem : list) {
            System.out.print(elem + " ");
        }
    }

}
