package LinkedList;

public class IntersectionofTwoLinkedLists {





	/* Link list ListNode */
	static class ListNode 
	{  
	    int data;  
	    ListNode next;  
	} 
	static ListNode head1 = null; 
	static ListNode head2 = null; 
	  
	/* Given a reference (pointer to pointer) to  
	the head of a list and an int, push a new  
	ListNode on the front of the list. */
	static void push( int new_data)  
	{  
	    ListNode new_ListNode = new ListNode();  
	  
	    new_ListNode.data = new_data;  
	    new_ListNode.next = (head1);  
	    (head1) = new_ListNode;  
	    System.out.println(new_ListNode);
	}  
	
	static void push1( int new_data)  
	{  
	    ListNode new_ListNode = new ListNode();  
	  
	    new_ListNode.data = new_data;  
	    new_ListNode.next = (head2);  
	    (head2) = new_ListNode;  
	    System.out.println(new_ListNode);
	}  
	  
	int[] a= {1, 2, 5, 3, 4, 7, 1};
	
	// Function to reverse linked list  
	static ListNode getIntersectionNode(ListNode head1, ListNode head2)  
	{
		
		if(head1 ==null || head2 == null) {
			return null;
		}
		
		ListNode curr1=head1;
		ListNode curr2=head2;
		while(curr1 !=curr2 ) {
			if(curr1 == null) {
				curr1=head2;
			}
			else {
				curr1=curr1.next;
			}
			
			if(curr2 == null) {
				curr2=head1;
			}
			else {
				curr2=curr2.next;
			}
		}
		
		return curr1;
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
//		 
//		push( 14);  
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
	    
//	    push1( 14);  
		push1( 13);
		push1( 12);  
	    push1( 11);  
	    push1( 10);  
	    push1( 9);  
	    push1( 8);  
		push1( 7);  
		push1( 6);
	    
	 
	    		
	    
	  
	    head1 = getIntersectionNode(head1, head2);  
	  
	    printList(head1);  
	} 





}
