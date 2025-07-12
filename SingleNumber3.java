package tutort;

import java.util.Arrays;

public class SingleNumber3 {

	public static void main(String[] args) {
		
		int[] nums = {1,2,1,3,2,5};
		
		int[] res=singleNumber( nums);
		System.out.println(res);

	}

	private static int[] singleNumber(int[] nums) {

		int[] res=new int[2];
		
		if(nums.length <=2) {
			return nums;
		}
		
		Arrays.sort(nums);
		int r=0;
		
		for(int i=1;i<nums.length;i++) {
		
			if(nums[i-1] != nums[i]) {
				res[r++]=nums[i-1];
			} else {
				i++;
			}
		}
		
		if(r==1) {
			res[1] =nums[nums.length-1];
		}
		
	return res;
	}

}
