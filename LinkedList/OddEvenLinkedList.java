package LinkedList;

import LinkedList.OddEvenLinkedList.ListNode;

public class OddEvenLinkedList {





	/* Link list ListNode */
	static class ListNode 
	{  
	    public ListNode(int i, ListNode head) {
			// TODO Auto-generated constructor stub
		}
		int data;  
	    ListNode next;  
	} 
	static ListNode head = null; 
	  
	/* Given a reference (pointer to pointer) to  
	the head of a list and an int, push a new  
	ListNode on the front of the list. */
	static void push( int new_data)  
	{  
		ListNode new_ListNode1=head;
	    ListNode new_ListNode = new ListNode(new_data, new_ListNode1);  
	  
	    new_ListNode.data = new_data;  
	    new_ListNode.next = (head);  
	    (head) = new_ListNode;  
	    System.out.println(new_ListNode);
	}  
	  
	// Function to reverse linked list  
	static ListNode OddEvenLinkedLis(ListNode head)  
	{
		
		if (head == null)
		      return head;

		    ListNode odd = head;
		    ListNode even = head.next;

		    // Maintain the even head
		    ListNode evenHead = even;

		    while (even != null && even.next != null) {

		      // Change pointers for odd list
		      odd.next = odd.next.next;
		      odd = odd.next;

		      // Change pointers for even list
		      even.next = even.next.next;
		      even = even.next;
		    }

		    // Assign even list at the end of odd list
		    odd.next = evenHead;

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
		 
//		push( 5);  
//		push( 4);
		push( 5);  
	    push( 4);  
	    push( 3);  
	    push( 2);  
	    push( 1);  
	 
	    		
	    
	  
	    head = OddEvenLinkedLis(head);  
	  
	    printList(head);  
	} 





}
