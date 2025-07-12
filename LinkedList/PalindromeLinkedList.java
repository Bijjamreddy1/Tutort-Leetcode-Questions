package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {

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
	static boolean MergeTwoSortedLists(ListNode head)  
	{
		
//		ListNode temp=head;
//		
//		List<Integer> list=new ArrayList<Integer>();
//		
//		while(temp !=null) {
//			list.add(temp.data);
//			temp=temp.next;
//		}
//		
//		int len=list.size()-1;
//		
//		for(int i=0;i<len;i++) {
//			if(list.get(len) ==list.get(i)) {
//				len--;
//			}else {
//				return false;
//			}
//		}
//		return true;
		
		
		
	        if(head == null || head.next==null){
	            return true;
	        }
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        ListNode curr = slow;
	        ListNode prev = null;
	        ListNode next;
	        while(curr != null){
	            next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	        }
	        ListNode right = prev;
	        ListNode left = head;
	        while(right != null){
	            if(right.data != left.data){
	                return false;
	            }
	            right = right.next;
	            left = left.next;
	        } 
	        return true;
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
//		push( 5);  
	    push( 1);  
	    push( 2);  
	    push( 2);  
	    push( 1);  
	    
//	    push1( 5);  
//	    push1( 4);  
//	    push1( 3);  
//	    push1( 2);  
//	    push1( 1); 
//	 
	    		
	    
	  
	    boolean res=MergeTwoSortedLists(head1);  
	  System.out.println(res);
	   
	} 





}
