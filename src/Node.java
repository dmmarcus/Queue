public class Node<T>{
	
	private T data = null;
	private Node<T> previous = null;
	private Node<T> next = null;
	
	public Node(){};
	
	public Node(T obj){
		
		this.data = obj;
	}
	
	public Node(T obj, Node<T> next, Node<T> previous){
		
		this.data = obj;
		this.next = next;
		this.previous = previous;
	}
	
	public T get(){
		
		return data;
	}
	
	public void set(T obj){
		
		data = obj;
	}
	
	public Node<T> getPrevious(){
		
		return previous;
	}
	
	public void setPrevious(Node<T> node){
		
		this.previous = node;
	}
	
	public Node<T> getNext(){
		
		return next;
	}
	
	public void setNext(Node<T> node){
		
		this.next = node;
	}
	

}
