import java.util.Stack;

//In the constructor initialize 2 stacks, “inbox” and “outbox”. The enqueue method pushes the value  onto inbox. 
//The dequeue method pops from outbox if it’s not empty, otherwise pop all items from  inbox onto outbox. If they’re both empty throw an exception
//http://readyforsoftwareinterview.blogspot.com/

public class Queue<E> {
	
private Stack<E> t1 = new Stack<>();
private Stack<E> t2 = new Stack<>();

public void enqueue(E n){
	t1.push(n);
}

public E dequeue(){
	if(t2.isEmpty()) {
		while(!t1.isEmpty()) {
			t2.push(t1.pop());
		}
	}
	return t2.pop();
}



}