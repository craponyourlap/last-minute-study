
public class StackADT<T> {
	
	private T[] arr;
	private int top;
	private int cap;
	
	StackADT(int size){
		arr = (T[]) new Object[size];
		cap = size;
		top = -1;
	}
	
	public void push(T data) {
		if (isFull()) {
			System.out.println("STACK IS FULL");
			return;
		}
		arr[++top] = data;
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top == cap - 1;
	}
	
	public T pop() {
		if (isEmpty()) {
			System.out.println("STACK IS EMPTY");
			return null;
		}
		return arr[top--];
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	
	public void printStack() {
		for (int i = 0 ; i <= top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackADT<Integer> stack = new StackADT<Integer>(5);

	    stack.push(1);
	    stack.push(2);
	    stack.push(3);

	    System.out.print("Stack: ");
	    stack.printStack();

	    // remove element from stack
	    stack.pop();
	    System.out.println("\nAfter popping out");
	    stack.printStack();

	}

}
