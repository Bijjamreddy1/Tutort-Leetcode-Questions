package tutort;

import java.util.ArrayList;

public class SummaryRanges {

	public static void main(String[] args) {

		int[] nums = {0,1,2,4,5,7};
		
		summaryRanges(nums);
		
	}

	private static void summaryRanges(int[] nums) {

		
		ArrayList<String> arr=new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			int start=nums[i];
			
			while(i+1<nums.length && nums[i]+1 == nums[i+1]) {
				i++;
			}
			
			if(start !=nums[i]) {
				arr.add(""+start+"->"+nums[i]);
			}
			else {
				arr.add(""+start);
			}
			
		}
	}

}
