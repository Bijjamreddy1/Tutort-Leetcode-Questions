package LinkedList;

import LinkedList.OddEvenLinkedList.ListNode;

public class MergeTwoSortedLists {

	/* Link list ListNode */
	static class ListNode 
	{  
	    public ListNode() {
			// TODO Auto-generated constructor stub
		}
		public ListNode(int i) {
			// TODO Auto-generated constructor stub
		}
		int data;  
	    ListNode next;  
	} 
	static ListNode head1 = null; 
	static ListNode head2 = null; 
	  
	
	static void push( int new_data)  
	{  
		ListNode new_ListNode1=head1;
	    ListNode new_ListNode = new ListNode();  
	  
	    new_ListNode.data = new_data;  
	    new_ListNode.next = (head1);  
	    (head1) = new_ListNode;  
	    System.out.println(new_ListNode);
	    
	    
	}  
	
	static void push1( int new_data)  
	{  
		ListNode new_ListNode1=head2;
	    ListNode new_ListNode = new ListNode();  
	  
	    new_ListNode.data = new_data;  
	    new_ListNode.next = (head2);  
	    (head2) = new_ListNode;  
	    System.out.println(new_ListNode);
	    
	    
	}  
	  
	// Function to reverse linked list  
	static ListNode MergeTwoSortedLists(ListNode list1, ListNode list2)  
	{
		
		ListNode ans = new ListNode(-1);  // create a dummy node
        ListNode temp = ans;
        while(list1!=null && list2!=null){ //Merge List
            
            if(list1.data <= list2.data) {  // add the next pointer of temp to the smallest value after comparing both lists
                temp.next = list1;
                list1=list1.next;
            }
            else{
                temp.next = list2;
                list2=list2.next;
            }
            temp= temp.next;
        }
        if(list1 != null){  // if any one list is still remaining then point our temp.next pointer to it, so all the values ahead of the list will also be automatically attached.
            temp.next= list1;
        }else{
            temp.next= list2;
        }
        return ans.next; 	
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
	    
	    push1( 5);  
	    push1( 4);  
	    push1( 3);  
	    push1( 2);  
	    push1( 1); 
	 
	    		
	    
	  
	    MergeTwoSortedLists(head1, head2);  
	  
	   
	} 





}
