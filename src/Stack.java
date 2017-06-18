import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class Stack<E> {

    private List<E> listInteger;


    public Stack() {
        this.listInteger = new LinkedList<>();
    }

    public void push(E integer) {
        listInteger.add(integer);
    }

    public boolean isEmpty() {
        return listInteger.isEmpty();
    }

    public int size() {
        return listInteger.size();
    }

    public synchronized E pop() {
        if (!listInteger.isEmpty()) {
            E poppedElement = peek();
            listInteger.remove(listInteger.size() - 1);
            return poppedElement;
        } else {
            throw new EmptyStackException();
        }
    }

    public E peek() {
        if (!listInteger.isEmpty()) {
            E poppedElement = listInteger.get(listInteger.size() - 1);
            return poppedElement;
        } else {
            throw new EmptyStackException();
        }
    }

    public synchronized Integer search(Integer searchElement) {
        Integer poppedElement = -1;
        if (!listInteger.isEmpty()) {
            poppedElement = listInteger.lastIndexOf(searchElement);
        }
        return poppedElement;
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(18);
        stack.push(20);
        System.out.println("size of stack" + stack.size());
        System.out.println("pop an element" + stack.peek());
        System.out.println("pop an element" + stack.pop());
        System.out.println("search an element" + stack.search(18));
        stack.push(18);
        System.out.println("push an element" + stack.peek());
        System.out.println("size of stack" + stack.size());
        System.out.println("stack empty" + stack.isEmpty());
    }
}
