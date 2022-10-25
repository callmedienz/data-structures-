package linkedlist;

public class testQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue();
		queue.printQueue();
		System.out.println("________________");		
		queue.enqueue(2);
		queue.enqueue(7);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.printQueue();
		System.out.println("________________");
		queue.dequeue();
		queue.printQueue();
	}

}
