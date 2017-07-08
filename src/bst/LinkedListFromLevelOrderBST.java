package bst;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListFromLevelOrderBST {

	public static class Node {
		int data;
		Node left;
		Node right;

		public Node() {
			this.left = null;
			this.right = null;
		}

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	static Node root=null;
	
	private static ArrayList<LinkedList<Node>> createLevelLinkedList(Node root)
	{
		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		LinkedList<Node> current = new LinkedList<Node>();
		current.add(root);
		
		while(current.size()>0)
		{
			result.add(current);
			LinkedList<Node> parents =current;
			current = new LinkedList<Node>();
			for(Node parent: parents)
			{
				if(parent.left!=null)
				{
					current.add(parent.left);
				}
				
				if(parent.right!=null)
				{
					current.add(parent.right);
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
		root = new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left= new Node(4);
		root.right.right=new Node(5);
		
		ArrayList<LinkedList<Node>> resultArray = new ArrayList<LinkedList<Node>>();
		
		resultArray=createLevelLinkedList(root);
		for(LinkedList<Node> linkedList: resultArray)
		{
			//System.out.println("------");
			for(Node node:linkedList)
			{
				System.out.print(node.data+"->");
			}
			System.out.println();
		}
	}
}
