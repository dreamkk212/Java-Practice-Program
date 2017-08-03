import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;


/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class DoubleStack<E> {
    
    private List<E> listInteger;

    public DoubleStack() {
        this.listInteger = new ArrayList<>();
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
        DoubleStack<Integer> DoubleStack = new DoubleStack<>();
        DoubleStack.push(10);
        DoubleStack.push(15);
        DoubleStack.push(18);
        DoubleStack.push(20);
        System.out.println("size of DoubleStack" + DoubleStack.size());
        System.out.println("peek an element" + DoubleStack.peek());
        System.out.println("pop an element" + DoubleStack.pop());
        System.out.println("search an element returns index" + DoubleStack.search(18));
        DoubleStack.push(18);
        System.out.println("peek an element" + DoubleStack.peek());
        System.out.println("size of DoubleStack" + DoubleStack.size());
        System.out.println("DoubleStack empty" + DoubleStack.isEmpty());
    }

}
