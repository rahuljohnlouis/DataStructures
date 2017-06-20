package bst;

public class BalancedTree {

	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}
 
	Node root = null;

	public static int checkBalanced(Node root) {
		if (root == null)
			return -1;

		int leftHeight = checkBalanced(root.left);
		if (leftHeight == Integer.MIN_VALUE)
			return leftHeight = Integer.MIN_VALUE;

		int rightHeight = checkBalanced(root.right);
		if (rightHeight == Integer.MIN_VALUE)
			return rightHeight = Integer.MIN_VALUE;

		int height = leftHeight - rightHeight;
		if (Math.abs(height) > 1) {
			return Integer.MIN_VALUE;
		} else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	public static boolean checkBalBST(Node root) {
		if (checkBalanced(root) == Integer.MIN_VALUE) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String args[]) {  
		Node root = new Node(20);
		root.left = new Node(19);
		root.right = new Node(21);
//		root.left.left = new Node(18);
//		root.left.right = new Node(30);
//		root.right.right = new Node(40);
//		root.right.right.right = new Node(45);

		if (checkBalBST(root)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Unbalanced");
		}
	}
}
