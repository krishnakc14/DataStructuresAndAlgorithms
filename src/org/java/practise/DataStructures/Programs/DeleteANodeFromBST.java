package org.java.practise.DataStructures.Programs;

import org.java.design.DataStructures.BinarySearchTree;
import org.java.design.DataStructures.Node;

public class DeleteANodeFromBST {

	Node parent = null;
	
	public Node delete(int data, Node root)
	{
		
		if(root == null){
			return root;
		}
		
		
		if(root.data == data)
		{
			//No children. Leaf node
			if(root.left == null && root.right == null){
				root = null;
				return root;
			}
			
			//1 child
			boolean left_tree = root.left != null && root.right == null;
			boolean right_tree = root.left == null && root.right != null;
			
			if(left_tree)
				return root.left;
			if(right_tree)
				return root.right;
			
			//2 children - Both left and Right
			Node current = root.right;
			while(current.left != null){
				current = current.left;
			}
			int minVal = current.data;
			delete(minVal, root);
			root.data = minVal;
			return root;
			
		}
		
		parent = root;
		
		if(data <= root.data)
		{
			parent.left = delete(data,root.left);
		}
		if(data > root.data)
		{
			parent.right = delete(data,root.right);
		}

		return root;
		
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
	
	
	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst = bst.pseudomain();
		
		DeleteANodeFromBST delete = new DeleteANodeFromBST();
		delete.printPre(delete.delete(18, bst.root));
		
	}

}
