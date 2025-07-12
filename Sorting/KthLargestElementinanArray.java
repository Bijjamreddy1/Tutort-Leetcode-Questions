package SortingQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class KthLargestElementinanArray {

	public static void main(String[] args) {

		int[] nums= {3, 2, 1, 5, 6, 4};
		int k=2;
		
		int res=findKthLargest(nums, k);
		System.out.println(res);
	}

	private static int findKthLargest(int[] nums, int k) {
		
//		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
//		
//		for(int i=0;i<nums.length;i++) {
//			pq.add(nums[i]);
//			
//			if(pq.size()>k) {
//				pq.poll();
//			}
//		}
//		return pq.peek();
		
//		int n=nums.length;
//		Arrays.sort(nums);
//		return nums[n-k];
		
		int n=nums.length;
		
		return n;
		
	}
	
	

}
