package linkedlist;

public class MyQueue {
	public class qNode  {
		public int data;//value store in Node 
		public qNode prev;// address of the next Node
		public qNode next;// address of the prev Node

		public qNode (int data, qNode prev) {
			this.data = data;
	        this.next = null;
	        this.prev = prev;
		}
	}
	qNode front = null;//store the first node 
	qNode rear = null;//store the last node 
	int size;
	public MyQueue()
	{
		this.front = null;
		this.rear = null; 
	}
	
	public void enqueue(int data)
    {
        // Create a new node
        qNode node = new qNode(data, this.rear);
        if (this.front == null){
            // When adding a first node of queue
            this.front = node;
            this.size = 1;
        }else{
            this.rear.next = node;
            this.size = this.size + 1;
        }
        this.rear = node;
    }
	
	public boolean isEmpty()
	{
		if(size ==0) {
			return true;
		}else {
			return false;
		}		
	}

	public int dequeue() {
		{
	        if (this.isEmpty() == true){
	            // When queue is empty
	            return -1;
	        }else{
	            int data = this.front.data;
	            qNode temp = this.front;
	            if (this.front == this.rear){
	                // When queue contains only one node
	                this.rear = null;
	                this.front = null;
	            }else{
	                this.front = this.front.next;
	                this.front.prev = null;
	            }
	            // Change queue size
	            this.size--;
	            // Delete node value
	            return data;
	         }
	       }
	     }
	
	public void printQueue() {
		if (size == 0) {
			System.out.println("Empty queue");
		}else {
			qNode current = front;
			while(current.next!=null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println(current.data);
		}
	}
}
