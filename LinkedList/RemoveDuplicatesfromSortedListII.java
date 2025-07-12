package LinkedList;

import LinkedList.RotateList.ListNode;

public class RemoveDuplicatesfromSortedListII {



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
	static ListNode RemoveDuplicatesFromSortedList(ListNode head)  
	{
		
		if (head == null)
        {
            return null;
        }
		
		ListNode temp=head;
		ListNode dummy=null;
		
		while(temp.next !=null) {
			if(temp.data !=temp.next.data){
                dummy=temp.next;
                temp=temp.next;
            }
		}
		
		
		return dummy;
		
		
        
		
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
		 
		push( 5);  
		push( 4);
		push( 4);  
	    push( 3);  
	    push( 3);  
	    push( 2);  
	    push( 1);  
	 
	    		
	    
	  
	    head = RemoveDuplicatesFromSortedList(head);  
	  
	    printList(head);  
	} 




}
