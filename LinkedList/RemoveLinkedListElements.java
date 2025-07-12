package LinkedList;

public class RemoveLinkedListElements {


	
	
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
	static ListNode removeList(ListNode head, int val)  
	{
		
		ListNode temp=new ListNode();
        ListNode curr = temp;
        temp.next=head;
		
        while(curr.next !=null){
            if(curr.next.data ==val){
            	curr.next=curr.next.next;
            }
            else {
            	curr=curr.next;
            }
 
        }
        return temp.next;
		
		
//		ListNode temp=head;
//		
//		while(temp !=null || temp.next !=null) {
//			if(temp.next.data ==val) {
//				temp.next=temp.next.next;
//			}
//			temp=temp.next;
//		}
//		
//		return head;

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
		 
		push( 6);  
		push( 5);
		push( 4);  
	    push( 3);  
	    push( 6);  
	    push( 2);  
	    push( 1);  
	    
	    //int n=2;
	    
	    int m = 6;
	    		
	    
	  
	    head = removeList(head, m);  
	  
	    printList(head);  
	} 

}
