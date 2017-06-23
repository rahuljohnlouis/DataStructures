// Iterative Queue based Java program to do level order traversal
// of Binary Tree
 
/* This is also Breadth First search for a tree*/
package bst;
import java.util.Queue;
import java.util.LinkedList;
 
/* Class to represent Tree node */
class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
 
/* Class to print Level Order Traversal */
public class LevelOrderTraversal {
 
    Node root;
 
    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    void printLevelOrder() 
    {
    	Queue<Node> queue = new LinkedList<Node>();
    	queue.add(root);
    	
    	
    	while(!queue.isEmpty())
    	{
    		Node tempNode = queue.poll();
    		System.out.println(tempNode.data);
    		
    		if(tempNode.left!=null)
    		{
    			queue.add(tempNode.left);
    		}
    		
    		if(tempNode.right!=null)
    		{
    			queue.add(tempNode.right);
    		}
    	}
    }
 
    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        LevelOrderTraversal tree_level = new LevelOrderTraversal();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}