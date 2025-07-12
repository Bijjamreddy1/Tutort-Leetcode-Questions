package tutort;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {

		int[] nums = {3,2,3};
		
		
		int res= MajorityElement(nums);
		System.out.println(res);
		
	}

	private static int MajorityElement(int[] nums) {
		
		Arrays.sort(nums);		
		int n=nums.length;
		return nums[n/2];
	}

}
