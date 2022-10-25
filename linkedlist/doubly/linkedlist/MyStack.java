package linkedlist;


public class MyStack {
	public class sNode{
		public int data;
		public sNode next;
		
		public sNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	sNode head = null;
	sNode tail = null;
	int size;
	public void push(int data) { //Add a new node to the end of the list
		//1. Create a new node
		sNode aNode = new sNode(data);
		//2. Connect the new node to the last node
		if(head==null) {
			head = aNode;
		}else {
			//2.1. Identify the last node
			sNode current = head;
			while(current.next != null) {
				current = current.next;	//go to the next node
			}
			//Outside the loop, we are staying in the last node
			//2.2.Connect the new node to the last node
			current.next = aNode;
		}
	}
	
	public boolean isEmpty()
	{
		if(size ==0) {
			return true;
		}else {
			return false;
		}		
	}
	public Object pop() {
			if(head != null) {
				sNode temp = head;
				int x = temp.data;
				head = head.next;
				temp.next = null;
				return x;
			}else {
				return null;
			}
	}
	
	public void printStack() {
		sNode current = head;
		if(current!=null) {
			while(current.next != null) {
				System.out.print(current.data + " "); //Print data of the current node
				current = current.next;	//go to the next node
			}
			System.out.println(current.data); //Print data of the last node
		}else {
			System.out.println("Empty stack");
		}
	}
}
