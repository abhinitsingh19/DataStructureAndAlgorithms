package com.dsa.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class AloopInLinkedList 
{

	public static void main(String[] args) 
	{

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head;

//		checkIfThereIsALoop(head);
		
		System.out.println(checkIfThereIsALoopUsingAnotherWay(head));


	}

	private static void checkIfThereIsALoop(Node head) 
	{
		Set<Node> set = new HashSet();
		Node temp = head;
		while(temp!=null)
		{

			if(!set.add(temp))
			{
				System.out.println("A loop");
				break;
			}
			else
			{
				temp = temp.next;
			}

		} 


	}
	
	
	private static boolean checkIfThereIsALoopUsingAnotherWay(Node head) 
	{
		Node slow_ptr = head;
		Node fast_ptr = head;
		boolean isLoop = false;
		
		while(slow_ptr!=null && fast_ptr!=null && fast_ptr.next!=null)
		{
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			if (slow_ptr==fast_ptr)
			{
				isLoop = true;
				break;
			}
			
			
			
		}
		return isLoop; 


	}

	private static void printNode(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			if(temp.next!=null)
				temp = temp.next;
			else
			{
				break;
			}
		} 

	}

}
