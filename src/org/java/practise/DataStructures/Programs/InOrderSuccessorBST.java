package org.java.practise.DataStructures.Programs;

import org.java.design.DataStructures.BinarySearchTree;
import org.java.design.DataStructures.Node;

public class InOrderSuccessorBST {
	
	//TODO : Solve a problem to find the in order predecessor in a binary search tree 
	// that has time complexity of O(h)
	
	public static int Successor(Node node, int data)
	{
		//When the node has no right subTree
		Node successor = null;
		Node ancestor =  node;
		
		while(data != ancestor.data)
		{
			
			if(data < ancestor.data)
			{
				successor = ancestor;
				ancestor = ancestor.left;
			}
			else
			{
				ancestor = ancestor.right;
			}
			
		}
		
		//When the node has a right subtree
		
		if(ancestor.right != null)
		{
			Node current = ancestor.right;
			
			while(current.left != null){
				current = current.left;
			}
			
			successor = current;
			
		}
		
		return successor.data;
		
	}

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst = bst.pseudomain();
		
		System.out.println(Successor(bst.root, 8));
		
		
	}

}
