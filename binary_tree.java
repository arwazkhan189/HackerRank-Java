//package binaryTree;
//
//import java.util.*;
//public class binary_tree {
//
//
//
//
//	public static void main ( String [] args) {
//		Scanner sc = new Scanner(System.in);
// createtree();
//	}
//
//	static Node createtree()
//	{
//
//		Node root = null;
//		System.out.println("please Enter the data" + " ");
//		Scanner sc = null;
//		int data = sc.nextInt();
//		if (data==-1)
//			return null;
//
//
//root = new Node(data);
//
//		System.out.println("Enter the left data" + data);
//		root.left=createtree();
//		
//		System.out.println("Enter the right data" + data);
//		root.right=createtree();
//
//		return root;
//	}
//
//
//	class Node{
//		Node left, right;
//		int data;
//
//		public Node (int data) {
//
//			this.data=data;
//
//		}
//
//
//
//
//
//	}
//
//
//}
