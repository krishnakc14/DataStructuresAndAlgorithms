package org.java.design.DataStructures;

public class BinarySearchTree {
	
	public Node root;
	
	public void insert(int data)
	{
		
		if(root == null){
			root = new Node(data);
			return;
		}
		
		insert(root,data);
		
	}
	
	public void insert(Node current, int data){

		if(data < current.data)
		{
			if(current.left != null){
				insert(root.left,data);
				return;
				
			}
			else{
				current.left = new Node(data);
				return;
			}
		}
		else
		{
			if(current.right != null){
				insert(current.right,data);
				return;
			}
			else{
				current.right = new Node(data);
				return;
			}
			
		}
		
		
	}
	
	public void print()
	{
		System.out.println("Elements in the tree");
		print(root);
		
	}
	
	public void print(Node node)
	{
		
		
		if(node != null)
		{
			System.out.print(node.data+"\t");
			print(node.left);
			print(node.right);
			return;
			
		}
		
	}
	
	public void search(int data)
	{
		
		if(root == null){
			System.out.println("Empty tree!");
			return;
		}
		
		search(root,data);
		
	}
	
	public void search(Node current, int data)
	{
		if(current == null)
			return;
		
		if(data == current.data){
			System.out.println("Found!");
			return;
		}
		
		if(data < current.data){
			search(current.left, data);
			return;
		}
		else{
			search(current.right,data);
			return;
		}
	}
	

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(15);
		bst.insert(10);
		bst.insert(20);
		bst.insert(8);
		bst.insert(12);
		bst.insert(17);
		bst.insert(25);
		bst.insert(35);
		bst.print();
		bst.search(225);
		
		
	}
	
	class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
		}
		
		
	}

}
