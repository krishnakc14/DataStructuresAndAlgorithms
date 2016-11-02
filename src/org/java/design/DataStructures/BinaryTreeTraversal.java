package org.java.design.DataStructures;

public class BinaryTreeTraversal {

	
	
	
	public void print(Node root)
	{
		System.out.println("Elements in the tree - PreOrderTraversal");
		printPre(root);
		System.out.println("\nElements in the tree - In Order Traversal");
		printIn(root);
		System.out.println("\nElements in the tree - Post Order Traversal");
		printPost(root);
		System.out.println("\nElements in the tree - Level Order Traversal");
		printLevelOrder(root);
		
	}
	
	public void printLevelOrder(Node node)
	{
		Queue queue = new Queue();
		queue.add(node);
		
		while(!queue.isEmpty())
		{
			Node current = queue.poll();
			System.out.print(current.data+"\t");
			
			if(current.left != null)
				queue.add(current.left);
			if(current.right != null)
				queue.add(current.right);
			
		}
	}
	
	public void printPre(Node node)
	{
		
		
		if(node != null)
		{
			System.out.print(node.data+"\t");
			printPre(node.left);
			printPre(node.right);
			return;
			
		}
		
	}
	
	public void printIn(Node node)
	{
		
		
		if(node != null)
		{
			
			printIn(node.left);
			System.out.print(node.data+"\t");
			printIn(node.right);
			return;
			
		}
		
	}
	
	public void printPost(Node node)
	{
		
		
		if(node != null)
		{
			
			printPost(node.left);
			printPost(node.right);
			System.out.print(node.data+"\t");
			return;
			
		}
		
	}
	
	
	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst = bst.pseudomain();
		
		BinaryTreeTraversal btt = new BinaryTreeTraversal();
		btt.print(bst.root);
		
	}

}
