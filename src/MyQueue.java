import org.w3c.dom.*;

import java.util.LinkedList;

/**
 * Created by Olivi on 27-09-2016.
 */
// y y add(value)
// remove()
// y y isEmpty()
// peek()
// y y size()


public class MyQueue <T>  {

    private LinkedList<T> list;
    private int countElements = 0;
    private T firstElement = null;


    //  Constuctor
    public MyQueue() {
        list = new LinkedList<T>();
    }


    public void add(T element) {
        list.add(element);
        countElements++;
    }

    public T remove() {
        firstElement = list.get(0);
        list.remove(firstElement);
        countElements--;

        return firstElement;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T peek() {
        firstElement = list.get(0);
        return firstElement;
    }

    public int size() {
        return countElements;
    }

    //toString method
    public String toString() {
        String tS = "";

        for (int i = 0; i < countElements; i++) {
            tS += list.get(i) + " ";
        }
        return tS ;
    }
}
