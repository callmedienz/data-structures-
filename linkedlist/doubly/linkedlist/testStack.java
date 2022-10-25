package linkedlist;

public class testStack {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.printStack();
		System.out.println("________________");		
		stack.push(2);
		stack.push(7);
		stack.push(5);
		stack.printStack();
		System.out.println("________________");
		stack.pop();	
		stack.printStack();		
	}

}
