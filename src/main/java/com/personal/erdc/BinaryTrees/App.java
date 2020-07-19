package com.personal.erdc.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

import models.Node;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int callNo = 0;
    public static void main( String[] args )
    {
       //for a given head(node), find the smallest value in the tree using BST
    	//left side of head and its sub-children
    	
    	
    	//this testcase should return 2
    	Node<Integer> head = new Node<Integer>(5);

    	head.setLeftNeighboor(new Node<Integer>(3));
    	head.getLeftNeighboor().setLeftNeighboor(new Node<Integer>(2));
    	head.getLeftNeighboor().setRightNeighboor(new Node<Integer>(4));
    	
    	head.getLeftNeighboor().getLeftNeighboor().setLeftNeighboor(new Node<Integer>(1));;
    	
    	//right side of head and its sub-children
    	head.setRightNeighboor(new Node<Integer>(10));
    	head.getRightNeighboor().setRightNeighboor(new Node<Integer>(12));
    	head.getRightNeighboor().setLeftNeighboor(new Node<Integer>(8));;
    	Integer smallest = findBiggestBST(head);
    	System.out.println(smallest);
    	
    }
    //we use <Integer> for method parameter because that's the 'TYPE' of node we're sending
    //we use int for the return type instead of Node<T> or Node<Integer> because we're going to return the values
    //of the nodes, rather than the node itself
    public static Integer findSmallestBST(Node<Integer> head) {
    	callNo+=1;
    	if(head.getValue() == null) {
    	
    		return null; //we'll use null to catch if the tree has no nodes
    	}
    	//see if this is leftmost node
    	if(head.getLeftNeighboor()==null) {//base case

    		return head.getValue();
    	}
    	//otherwise do another pass
    	//the result of a, is the result of b...z iteration
    	//here we have the final result being returned(head.getValue()) above, to each recursive call of 'findSmallestBST'
    	//therefore, base case 'head.getValue()' condition returns the value for it's call from parent, then THAT function 
    	//returns that same value as it's evaluation of the recursive function, and so on until the original call returns the result
    	return findSmallestBST(head.getLeftNeighboor());
    	
    }
    //find biggest
    public static Integer findBiggestBST(Node<Integer> head) {
    	callNo+=1;
    	if(head.getValue() == null) {
    	
    		return null; //we'll use null to catch if the tree has no nodes
    	}
    	//see if this is leftmost node
    	if(head.getRightNeighboor()==null) {//base case

    		return head.getValue();
    	}
    	//otherwise do another pass
    	//the result of a, is the result of b...z iteration
    	//here we have the final result being returned(head.getValue()) above, to each recursive call of 'findSmallestBST'
    	//therefore, base case 'head.getValue()' condition returns the value for it's call from parent, then THAT function 
    	//returns that same value as it's evaluation of the recursive function, and so on until the original call returns the result
    	return findBiggestBST(head.getRightNeighboor());
    	
    }
}
