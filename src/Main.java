/**
 * Created by Olivi on 27-09-2016.
 */
public class Main {

    public static void main(String[] args) {

        //STACK
        MyStack<Integer> stack = new MyStack<>();
        stack.push(4);
        stack.push(67);
        stack.push(30);

        System.out.println("Return the size of the stack: " + stack.size());
        System.out.println("Print the stack:\n" + stack);
        System.out.println("Is the stack empty? \n" + stack.isEmpty());
        System.out.println("Return last element: \n" + stack.pop());
        System.out.println("Print the stack:\n" + stack);


        //QUEUE
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(3);
        queue.add(43);
        System.out.println("Print the queue:\n" + queue);
        System.out.println("Is the queue empty? \n" + queue.isEmpty());
        System.out.println("Return the size of the queue: " + queue.size());
        System.out.println("Return first element: \n" + queue.remove());
    }
}
