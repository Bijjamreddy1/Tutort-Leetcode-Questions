package LinkedList;

import LinkedList.ReverseLinkedList.ListNode;

public class DeletenNodesAftermNodesofaLinkedList {
	
	
	/* Link list ListNode */
	static class ListNode 
	{  
	    int data;  
	    ListNode next;  
	} 
	static ListNode head = null; 
	  
	/* Given a reference (pointer to pointer) to  
	the head of a list and an int, push a new  
	ListNode on the front of the list. */
	static void push( int new_data)  
	{  
	    ListNode new_ListNode = new ListNode();  
	  
	    new_ListNode.data = new_data;  
	    new_ListNode.next = (head);  
	    (head) = new_ListNode;  
	    System.out.println(new_ListNode);
	}  
	  
	// Function to reverse linked list  
	static ListNode DeletenNodesAftermNodesofaLinkedList(ListNode head, int m, int n)  
	{
		
		ListNode curr=head;
		
		while(true) {
			
			for(int i=1;i<m;i++) {
				if(curr ==null) {
					return head;
				}
				curr=curr.next;
			}
			
			for(int i=0;i<n;i++) {
				if(curr ==null && curr.next ==null) {
					return head;
				}
				curr.next=curr.next.next;
			}
			
			curr=curr.next;
			
		}
		
		
	}  
	  
	// Function to print the Linked list  
	static void printList(ListNode head)  
	{  
	    while (head != null)  
	    {  
	        System.out.print(head.data + " ");  
	        head = head.next;  
	    }  
	}  
	  
	// Driver Code  
	public static void main(String[] args)  
	{  
	    /* Start with the empty list */
	    //ListNode head = null;  
	  
	    /* Use push() to construct below list  
	    1->2->3->4->5 */
		push( 13);
		push( 12);
		push( 11); 
		push( 10);  
		 push( 9);  
		 push( 8);  
		 push( 7);  
		 push( 6);
		push( 5);  
	    push( 4);  
	    push( 3);  
	    push( 2);  
	    push( 1);  
	    
	    //int n=2;
	    
	    int m = 2;
	    int n = 3;
	    
	  
	    head = DeletenNodesAftermNodesofaLinkedList(head, m, n);  
	  
	    printList(head);  
	} 
}
