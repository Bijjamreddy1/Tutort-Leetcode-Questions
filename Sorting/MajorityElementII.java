package SortingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {

	public static void main(String[] args) {

		int[] nums = {1,2};
		
		List<Integer> res=majorityElement(nums);
		
		System.out.println(res);
		
		
	}

	private static List<Integer> majorityElement(int[] nums) {
		
		Arrays.sort(nums);
		
		int n=nums.length;
		
		
		
		List<Integer> li=new ArrayList<Integer>();
		
		
		
		int res=n/3;
		
		li.add(nums[res]);
		
		return li;
		
		
		
	}

}
