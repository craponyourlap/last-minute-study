
public class LinkedListADT<T> {
	Node head;
	
	class Node{
		T data;
		Node next;
		Node(T data){
			this.data = data;
			next = null;
		}
	}
	
	public void insertAtBeginning(T data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	public void deleteAtStart() {
		if (head == null) {
			System.out.println("THE LIST IS FUCKING EMPTY");
			return;
		}
		head = head.next;
	}
	
	public void insertAtEnd(T data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			return;
		}
		Node t = head;
		while (t.next != null)t = t.next;
		t.next = n;
	}
	
	public void deleteAtEnd() {
		if (head.next == null) {
			deleteAtStart();
		}
		Node p = null;
		Node t = head;
		while (t.next != null) {
			p = t;
			t = t.next;
		}
		p.next = null;
	}
	
	public void insertAtIndex(int index, T data) {
		int size = getSize();
		if (index < 0 || index > size - 1) {
			System.out.println("CAN'T INSERT HERE RETARD");
		}
		else {
			Node n = new Node(data);
			Node t = head;
			while (--index > 0)t = t.next;
			n.next = t.next;
			t.next = n;
		}
	}
	
	public void deleteAtIndex(int index) {
		int size = getSize();
		if (index < 0 || index > size - 1)
			System.out.println("CAN'T DELETE HERE RETARD");
		else {
			Node t = head;
			Node p = null;
			while (--index > 0) {
				p = t;
				t = t.next;
			}
			p.next = t.next;
		}
	}
	public int getSize() {
		// TODO Auto-generated method stub
		int size = 0;
		Node t = head;
		while (t != null) {
			t = t.next;
			size++;
		}
		return size;
	}
	
	public void display() {
		Node t = head;
		while (t != null) {
			System.out.print(t.data + " ");
			t = t.next;
		}
		System.out.println();
	}
	
	public void reverse() {
		Node pt = head;
		Node p = null, c = null;
		while (pt != null) {
			c = pt;
			pt = pt.next;
			
			c.next = p;
			p = c;
			head = c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListADT<Integer> listObj = new LinkedListADT<Integer>();

        listObj.insertAtBeginning(15);
        listObj.insertAtBeginning(10);
        listObj.insertAtBeginning(5);

        listObj.display();
        System.out.println("size: "+listObj.getSize());

        listObj.insertAtEnd(20);
        listObj.insertAtEnd(25);
        listObj.insertAtEnd(30);
        listObj.insertAtEnd(35);

        listObj.display();
        System.out.println("size: "+listObj.getSize());

        listObj.insertAtIndex(3,100);

        listObj.display();
        System.out.println("size: "+listObj.getSize());
        
        listObj.deleteAtEnd();
        listObj.display();
        System.out.println("size: "+listObj.getSize());
        
        listObj.deleteAtStart();
        listObj.display();
        System.out.println("size: "+listObj.getSize());
        
        listObj.deleteAtIndex(3);
        listObj.display();
        System.out.println("size: "+listObj.getSize());
        
        listObj.reverse();
        listObj.display();
        System.out.println("size: "+listObj.getSize());
	}

}
