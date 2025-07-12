package tutort;

import java.util.ArrayList;
import java.util.List;

public class ShuffletheArray {

	public static void main(String[] args) {

		int[] nums = {2,5,1,3,4,7};
		int n=3;
		
		int len=nums.length;
		
		
		int firsthalf=0;
		int secondhalf=n;
		
		List<Integer> arr=new ArrayList<Integer>();
		
		while(firsthalf < n) {
			arr.add(nums[firsthalf]);
			arr.add(nums[secondhalf]);
			
			firsthalf++;
			secondhalf++;
		}
		
		int[] res=new int[len];
		
		int index=0;
		for(int i:arr) {
			res[index] =i;
			index++;
			
		}
		System.out.println(res);
	}

}
