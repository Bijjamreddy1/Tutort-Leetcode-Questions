package tutort;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

	public static void main(String[] args) {

		int [] nums = {1,2,1,3,2,5};
		
		int[] res=singleNumber(nums);
		System.out.println(res);
		
	}

	private static int[] singleNumber(int[] nums) {

		List<Integer> arr=new ArrayList<Integer>(2);
		
		int n = nums.length;
        for(int i = 0; i<n; i++)
        {
            int num = nums[i];
            int count = 0;
            for(int j = 0; j<n; j++)
            {
                if(nums[j] == num)
                {
                    count++;
                }
            }
            if(count == 1)
            {
                arr.add(num);
            }
        }
        
		
        int[] res=new int[2];
        
        int index=0;
        for(int j:arr) {
        	res[index] = j;
        	index ++;
        }
        return res;
	}

}
