import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Olivi on 28-09-2016.
 */
public class MyQueueTest {

    MyQueue<Integer> queue = new MyQueue<>();

    @Before
    public void setUp() throws Exception {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
    }

    @Test //VIRKER
    public void add() throws Exception {
        queue.add(6);

        assertEquals(6, queue.size());
    }

    @Test //VIRKER
    public void remove() throws Exception {
        queue.remove();

        assertEquals(4, queue.size());
    }

    @Test //VIRKER
    public void isEmpty() throws Exception {

        assertEquals(false, queue.isEmpty());
    }

    @Test //VIRKER
    public void peek() throws Exception {

        assertEquals(5, queue.size());
    }

    @Test //VIRKER
    public void size() throws Exception {

        assertEquals(5, queue.size());
    }

}