package tutort;

import java.util.Arrays;

public class MinimumMovestoEqualArrayElements {

	public static void main(String[] args) {

		int[] nums = {1,1,1};
		
		int res=minMoves(nums);
		System.out.println(res);
		
	}

	private static int minMoves(int[] nums) {
		
		Arrays.sort(nums);
		
		int sum=0;
		
		for(int i=nums.length;i>0;i--) {
			
			int diff=nums[i-1]-nums[0];
			sum +=diff;
			
			
		}
		return sum;
	
	}

}
