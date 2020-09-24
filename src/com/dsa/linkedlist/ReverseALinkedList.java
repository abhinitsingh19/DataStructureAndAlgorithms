package com.dsa.linkedlist;

public class ReverseALinkedList 
{
	static Node head= null;
	public static Node insert(Node node, int i)
	{
		if(node==null)
		{
			node = new Node(i);
			head = node;
		}
		else 
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			Node newNode = new Node(i);
			temp.next = newNode;
			newNode.next = null;

		}
		return head;
	}
	public static void main(String[] args) 
	{


		for(int i=1 ; i<5 ;i++)
		{
			head= insert(head,i);
		}

		printNode(head);

		Node newHead = reverseLinkedList(head);
		System.out.println("Reversed List ");
		printNode(newHead);

	}
	private static Node reverseLinkedList(Node head) 
	{
		Node prev = null,next = null;
		while(head!=null) 
		{
			next = head.next;
			head.next = prev;
			prev = head;
			head=next;
		}
		return prev;

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
