package strings;

public class RevLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {

			Node temp = head;
			if (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;

		}
	}

	private void display() {
		Node temp = head;
		while (temp!= null) {
			System.out.println("Data " + temp.data);
			temp = temp.next;
		}
	}
	
	public void reverse()
	{
		Node prev=null;
		Node cur=head;
		Node nex=head;
		while(cur.next!=null)
		{
			nex=cur.next;
			cur.next=prev;
			prev=cur;
		}
		head=prev;
	}

	public static void main(String args[]) {
		RevLinkedList r = new RevLinkedList();
		r.addNode(1);
		r.addNode(2);
		r.addNode(3);
		r.display();
		r.reverse();
		r.display();
	}
}
