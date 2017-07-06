package bst;

public class MinimalBSTFromSortedArray {

	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static Node root=null;
	
	public static Node createBST(int[] a)
	{
		return createBST(a,0,a.length-1);
	}
	
	public static Node createBST(int[]a,int start, int end)
	{
		if(end<start)
		{
			return null;
		}
		int mid=(start+end)/2;
		
		Node newNode = new Node(a[mid]);
		System.out.println(newNode.data);
		newNode.left=createBST(a,start,mid-1);
		newNode.right=createBST(a,mid+1,end);
		return newNode;
	}
	
	public static void display(Node root)
	{
		if(root!=null)
		{
			display(root.left);
			//System.out.println(root.data);
			display(root.right);
		}
	}
	public static void main(String[] args) {
	
		int[] a = {2,3,4,5,6,7,8,9};
		
		Node ini=createBST(a);
		
		display(ini);
		
	}
}
