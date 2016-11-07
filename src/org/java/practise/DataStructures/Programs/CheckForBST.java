package org.java.practise.DataStructures.Programs;

import org.java.design.DataStructures.BinarySearchTree;
import org.java.design.DataStructures.Node;
import org.java.design.DataStructures.Tree;

public class CheckForBST {

	//This program is to find out if the given tree is a BinarySearch tree or not
	
	boolean leftBool = true;
	boolean rightBool = true;
	int small = Integer.MIN_VALUE;
	int large = Integer.MAX_VALUE;
	
	public boolean check(Node node)
	{
		
		if(node == null)
			return true;
		
		int root_data = node.data;
		System.out.print(root_data+"\t");
		
		if(node.left != null)
		{
			if(node.left.data < root_data)
				leftBool = check(node.left);
			else
				return false;
		}
		
		if(node.right != null)
		{
			if(node.right.data > root_data)
				rightBool = check(node.right);
			else
				return false;
		}
		
		return leftBool&&rightBool;
		
	}
	
	//An optimized version of the search
	public boolean checkCopied(Node node, int left, int right)
	{
		
		if(node == null)
			return true;
		
		if(node.data >= left && node.data <= right)
		{
			
			leftBool = checkCopied(node.left, small, node.data);
			
			rightBool = false;
			if(leftBool)
				rightBool = checkCopied(node.right, node.data, large);
			
			return rightBool;
			
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst = bst.pseudomain();
		
		CheckForBST cbst = new CheckForBST();
		System.out.println("The tree is a Binary Search tree? "+cbst.check(bst.root));
		System.out.println("Copied Method value: "+cbst.checkCopied(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		Tree tree = new Tree();
		tree = tree.pseudoMain();
		System.out.println("The tree is a Binary Search tree? "+cbst.check(tree.root));
		
	}

}
