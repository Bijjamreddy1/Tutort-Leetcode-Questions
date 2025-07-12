package tutort;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElementI2 {

	public static void main(String[] args) {

		int[] nums = {1,2,1};
		
		nextGreaterElement(nums);
		
	}

	private static int[] nextGreaterElement(int[] nums) {

		int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=-1;
            for(int j=1;j<nums.length;j++){
                if(nums[(i+j)%nums.length]>nums[i]){
                    arr[i]=nums[(i+j)%nums.length];
                    System.out.println(arr);
                    break;
                }
            }
        }
        System.out.println(arr);
		return arr;
	}

}
