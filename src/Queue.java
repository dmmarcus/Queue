import java.util.NoSuchElementException;
public class Queue<T> {
	
	private Node<T> head = null;
	private Node<T> tail = null;
	private int queueSize = 0;
	
	public Queue(){};
	
	public Queue(T obj){
		
		head = new Node<T>(obj);
		queueSize = 1;
	}
	
	public Queue(T head, T tail){
		
		this.head = new Node<T>(head);
		this.tail = new Node<T>(tail);
		this.head.setPrevious(this.tail);
		this.tail.setNext(this.head);
		
		queueSize = 2;
	}

	public void enqueue(T obj){
		
		if (queueSize == 0){
			
			head = new Node<T>(obj);
			
		}
		else if (queueSize == 1){
			
			tail = new Node<T>(obj, head, null);
			
		} 
		else {
			
			tail = new Node<T>(obj, tail, null);
		}
		
		queueSize += 1;
	}
	
	public T dequeue() throws NoSuchElementException{
		
		if (queueSize == 0){
	
			throw new NoSuchElementException();
		}
		else if (queueSize == 1){
			
			T swap = head.get();
			head = null;
			queueSize -= 1;
			return swap;
		} else {
			
			T swap = head.get();
			head = head.getPrevious();
			head.setNext(null);
			queueSize -= 1;
			return swap;
		}
	}
	
	public int size(){
		
		return queueSize;
	}
}
