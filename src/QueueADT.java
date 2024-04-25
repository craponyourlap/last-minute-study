
public class QueueADT<T> {
	int SIZE;
	T[] items;
	int front, rear;
	
	QueueADT(int SIZE){
		this.SIZE = SIZE;
		items = (T[]) new Object[SIZE];
		front = -1;
		rear = -1;
	}
	
	boolean isFull() {
		return front == 0 && rear == SIZE - 1;
	}
	
	boolean isEmpty() {
		return front == -1;
	}
	
	void enQueue(T e) {
		if (isFull())System.out.println("SHIT IS FULL");
		else {
			if (isEmpty())front = 0;
			rear++;
			items[rear] = e;
		}
	}
	
	T deQueue() {
		T e = null;
		if (isEmpty()) {
			System.out.println("SHIT IS EMPTY");
			return e;
		}
		else {
			e = items[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
			}
			else {
				front++;
			}
		}
		return e;
	}
	
	void display() {
	    int i;
	    if (isEmpty()) {
	      System.out.println("Empty Queue");
	    }
	    else {
	      // display the front of the queue
	      System.out.println("\nFront index-> " + front);

	      // display element of the queue
	      System.out.println("Items -> ");
	      for (i = front; i <= rear; i++)
	        System.out.print(items[i] + "  ");

	      // display the rear of the queue
	      System.out.println("\nRear index-> " + rear);
	    }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueADT<Integer> q = new QueueADT<Integer>(5);

	    // try to delete element from the queue
	    // currently queue is empty
	    // so deletion is not possible
	    q.deQueue();

	    // insert elements to the queue
	    for(int i = 1; i < 6; i ++) {
	      q.enQueue(i);
	    }

	    // 6th element can't be added to queue because queue is full
	    q.enQueue(6);

	    q.display();

	    // deQueue removes element entered first i.e. 1
	    q.deQueue();

	    // Now we have just 4 elements
	    q.display();

	}

}
