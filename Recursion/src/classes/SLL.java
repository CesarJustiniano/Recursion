package classes;

public class SLL<E> {
	private static class Node<E> {
		private E element; 
		private Node<E> next;
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public Node(E element) { this(element, null); } 
		public Node() { this(null, null); }
		public E getElement() { return element; }
		public void setElement(E element) { this.element = element; }
		public Node<E> getNext() { return next; }
		public void setNext(Node<E> next) { this.next = next; }	
	}

	private Node<E> first = new Node<E>(); 
	private Node<E> last = new Node<E>();
	private int size = 0; 
	private int count = 0;
	
	public void addFirst(E e) { 
		Node<E> nuevo = new Node<E>(e);
		if(size == 0){
			last = first = nuevo;
		}
		else if(size == 1){
			first = nuevo;
			first.setNext(last);
		}
		else{
			nuevo.setNext(first);
			first = nuevo;
		}
		size++;  
	}
	
              // returns string formed by elements in this list, separated by spaces
	public String toString() { 
		String s = ""; 
		Node<E> current = first; 
		while (current != null) { 
			s += " " + current.getElement(); 
			current = current.getNext(); 
		}
		return s; 
	}
	
	public void reverse() { 
		if (size > 1){
			first = recReverse(first, last);	
		}
	} 
	
	private Node<E> recReverse(Node<E> b, Node<E> c) { 
	       if  (c==null) return b;
	       Node<E> a=c.getNext(); 
	       c.setNext(b);
	       return recReverse(c, a);
	}


}


