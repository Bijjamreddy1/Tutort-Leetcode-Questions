package tutort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArrayAssignment {

	public static void main(String[] args) {

		int[] arr= {2,3,4};
		
		int target=6;
		
		int[] result=twoSum(arr, target);
		
	    System.out.println("[" + result[0] + ", " + result[1] + "]");

		
		
	}

	private static int[] twoSum(int[] arr, int target) {
		
		int left=1;
		int right=arr.length;
		
		
		
		while(left<right) {
			int sum=arr[left-1]+ arr[right-1];
			if(sum==target) {
				  return new int[]{left, right};
			}else if( sum<target) {
				left ++;
			}else {
				right++;
			}
		}
		
		 return new int[]{-1, -1};
		
	}

}
