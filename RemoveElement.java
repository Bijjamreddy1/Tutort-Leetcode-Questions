package tutort;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {

		int[] nums = {0,1,2,2,3,0,4,2};
		int val=2;
		
		removeElement(nums, val);
	}

	private static void removeElement(int[] nums, int val) {

		int index=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != val) {
				index++;
				arr.add(nums[i]);
				
			}
		}
		
		System.out.println(index);
		System.out.println(arr);
	}

}
