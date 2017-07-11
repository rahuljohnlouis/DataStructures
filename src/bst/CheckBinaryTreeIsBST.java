package bst;

public class CheckBinaryTreeIsBST {

	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	static Node root = null;

//	public static boolean checkBST(Node node) {
//
//		if (node == null) return true;
//		if (node.left != null) {
//			if (!checkBSTLeft(node.left, node.data))
//				return false;
//		}
//		if (node.right != null) {
//			if (!checkBSTRight(node.right, node.data))
//				return false;
//		}
//
//		if (!checkBST(node.left))
//			return false;
//
//		if (!checkBST(node.right))
//			return false;
//
//		return true;
//	}
//
//	private static boolean checkBSTLeft(Node left, int data) {
//		if (left == null)
//			return true;
//		if (left.data < data)
//			return true;
//		else
//			return false;
//	}
//
//	private static boolean checkBSTRight(Node right, int data) {
//		if (right == null)
//			return true;
//		if (right.data >= data)
//			return true;
//		else
//			return false;
//	}

	static boolean checkBST(Node n)
	{
		return checkBST(n,null,null);
	}

	static boolean checkBST(Node n, Integer min, Integer max)
	{
		if(n==null)
		{
			return true;
		}
		if((min!=null &&n.data<=min) || (max!=null && n.data>max))
		{
			return false;
		}
		
		if(!checkBST(n.left,min,n.data) || !checkBST(n.right,n.data,max))
		{
			return false;
		}
		return true;
	}
	public static void main(String args[]) {
		root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
//		root.left.left = new Node(5);
//		root.left.right = new Node(15);
//		root.left.left.left = new Node(3);
//		root.left.left.right = new Node(6);
//		root.left.right.right = new Node(17);

		System.out.println(checkBST(root));

	}
}
