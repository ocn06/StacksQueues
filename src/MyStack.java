import java.lang.reflect.Array;

/**
 * Created by Olivi on 27-09-2016.
 */

/*
Y Y push(value)
Y Y pop()
Y Y isEmpty()
peek()
Y Y size()

 */
public class MyStack<T> {

    private T[] list;
    private int capacity;
    private int countElements = 0;

    //Constructor
    public MyStack() {
        capacity = 100;
        list = (T[]) new Object[capacity];
    }

    public void push(T element) {
        //Saves the element at the first empty index
        list[countElements] = element;
        countElements++;
    }

    public T pop() {
        T lastElement = list[countElements - 1];
        countElements--;

        return lastElement;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T peek() {
        T lastElement = list[countElements - 1];

        return lastElement;
    }

    //Size method
    public int size() {
        return countElements;
    }

    //toString
    public String toString() {
        String tS = "";

        for (int i = 0; i < countElements; i++) {
            tS += list[i] + " ";
        }
        return tS ;
    }



}
