package tutort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement2 {

	public static void main(String[] args) {

		int[] nums = {1};
		
		
		List<Integer> res= MajorityElement(nums);
		System.out.println(res);
		
	}

	private static List<Integer> MajorityElement(int[] nums) {
		
		ArrayList<Integer> val=new ArrayList<Integer>();
		
		Arrays.sort(nums);		
		int n=nums.length;
		if(n/3==0) {
			for(int i=1;i<=n;i++) {
				if(!(nums[i] ==nums[i-1])){
					val.add(nums[i-1]);
				}
				
			}
		}
		else {
			int out=nums[n/3];
			val.add(out);
		}
		
		return val;
		
		
	}

}
