package org.java.practise.DataStructures.Programs;

public class BSTMinAndMax {
	
	public Node root;
	int count = 0;
	int leftVal, rightVal, height = 0;
	
	public void findMax(){
		
		Node current = root;
		while(current.right != null){
			current = current.right;
		}
		System.out.println("Max element = "+current.data);
		
	}
	
	public void findMin(){
		
		Node current = root;
		while(current.left != null){
			current = current.left;
		}
		System.out.println("Min element = "+current.data);
		
	}
	
	public void heightForPerfectBinaryTree()
	{
		
		int nodes = (int) count(root) ;
		System.out.println("No of Nodes: "+nodes);
		
		int log = (int) (Math.log(nodes)/Math.log(2));
		System.out.println("Height = "+log);
		
	}
	
	public void height()
	{
		
		System.out.println("Height of the Tree = " +findHeight(root));
		
	}
	
	public int findHeight(Node node)
	{
		
		if(node == null)
			return -1;
			
		leftVal = findHeight(node.left);
		rightVal = findHeight(node.right);
		height =  Math.max(leftVal,rightVal)+1;
		
		return height;
		
	}
	
	public double count(Node node)
	{
		
		
		if(node != null)
		{
			count++;
			count(node.left);
			count(node.right);
			
		}
		
		return count;
		
	}
	
	
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

	public static void main(String[] args) {
		
		BSTMinAndMax bst = new BSTMinAndMax();
		bst.insert(15);
		bst.insert(10);
		bst.insert(20);
		bst.insert(8);
		bst.insert(12);
		bst.insert(17);
		bst.insert(25);
		bst.insert(35);
		/*bst.insert(17);
		bst.insert(25);
		bst.insert(35);
		bst.insert(17);
		bst.insert(25);
		bst.insert(35);
		bst.insert(17);*/
		bst.findMin();
		bst.findMax();
		bst.height();
		
		
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
