package bst;

public class BSTDelete {

	public static class Node {
		public int data;
		public Node right;
		public Node left;

		public Node(int data) {
			this.data = data;
		}
	}

	public static Node roote = null;

	/* Insert new Node into tree */
	public static void insertNode(Node root, int data) {
		if (roote == null) {
			Node newNode = new Node(data);
			roote = newNode;
			return;
		}

		if (root.data > data) {
			if (root.left == null) {
				root.left = new Node(data);
				return;
			} else {
				insertNode(root.left, data);
			}
		} else if (root.data <= data) {
			if (root.right == null) {
				root.right = new Node(data);
			} else {
				insertNode(root.right, data);
			}
		}
	}
	/* End of Adding New Node to the tree */

	public static void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.println(root.data);
			display(root.right);
		}
	}

	public static Node deleteElement(Node root, int data)
	{
		if(root==null) return null;
		
		if(root.data<data)
		{
			root.right=deleteElement(root.right,data);
		}
		else if(root.data>data)
		{
			root.left=deleteElement(root.left,data);
		}
		else
		{
			if(root.right==null)
			{
				return root.left;
			}
			if(root.left==null)
			{
				return root.right;
			}
			
			Node minValue=findMin(root.right);
			root.data=minValue.data;
			root.right=deleteElement(root.right,root.data);
		}
		return root;
	}
	
	private static Node findMin(Node node)
	{
		while(node.left!=null)
		{
			node=node.left;
		}
		return node;
	}
	
	
	public static void main(String args[]) {
		insertNode(roote, 50);
		insertNode(roote, 30);
		insertNode(roote, 70);
		insertNode(roote, 20);
		insertNode(roote, 40);
		insertNode(roote, 60);
		insertNode(roote, 80);
		
		//display(roote);
		
		deleteElement(roote,30);
		display(roote);
	}
}
