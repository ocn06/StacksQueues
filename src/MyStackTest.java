import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Olivi on 27-09-2016.
 */
public class MyStackTest {

    MyStack<Integer> stack = new MyStack<>();

    @Before
    public void setUp() throws Exception {

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    }

    @Test //VIRKER
    public void push() throws Exception {

        stack.push(6);
        assertEquals(6, stack.size());
    }

    @Test //VIRKER
    public void pop() throws Exception {

        stack.pop();
        assertEquals(4,stack.size());
    }

    @Test //VIRKER
    public void isEmpty() throws Exception {

        assertEquals(false, stack.isEmpty());
    }

    @Test //VIRKER
    public void peek() throws Exception {

        stack.peek();
        assertEquals(5, stack.size());
    }

    @Test //VIRKER
    public void size() throws Exception {

        assertEquals(5, stack.size());
    }

}