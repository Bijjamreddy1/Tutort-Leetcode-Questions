package LinkedList;

import LinkedList.RemoveLinkedListElements.ListNode;

public class ReorderList {




	
	
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
	static ListNode reorderList(ListNode head)  
	{
		
		if (head == null || head.next == null)
        {
            return head;
        }
        ListNode curr = head;
        while (curr != null && curr.next != null)
        {
            int man = curr.data;
            curr.data = curr.next.data;
            curr.next.data = man;
            curr = curr.next.next;
        }
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
//		push( 5);  
	    push( 4);  
	    push( 3);  
	    push( 2);  
	    push( 1);  
	    
	    
	    		
	    
	  
	    head = reorderList(head);  
	  
	    printList(head);  
	} 


}
