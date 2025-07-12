package LinkedList;

import LinkedList.ReorderList.ListNode;

public class RotateList {

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
	static ListNode rotateList(ListNode head, int k)  
	{
		
		if (head == null)
        {
            return head;
        }
		
		int length=1;
		
		ListNode lastTail=head;
		while(lastTail.next !=null) {
			lastTail=lastTail.next;
			length++;
			
		}
		
		ListNode targetTail=head;
		
		for(int j=length-k%length;j>1;j--) {
			targetTail=targetTail.next;
		}
		
		lastTail.next=head;
		head=targetTail.next;
		targetTail.next=null;
		return head;
		
		
        
		
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
		 
//		push( 7);  
//		push( 5);
		push( 5);  
	    push( 4);  
	    push( 3);  
	    push( 2);  
	    push( 1);  
	    
	    int k=2;
	    		
	    
	  
	    head = rotateList(head, k);  
	  
	    printList(head);  
	} 



}
