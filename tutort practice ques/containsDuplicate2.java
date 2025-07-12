package tutort;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate2 {

	public static void main(String[] args) {

		int[] nums = {1,2,3,1};
		int k=3;
		
		boolean value=containsDuplicate(nums, k);
		System.out.println(value);
	}

	private static boolean containsDuplicate(int[] nums, int k) {

		
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();   
        for(int i=0;i<nums.length;i++){
            

            if(!hm.containsKey(i))
            {
                hm.put(nums[i], i);
            }
            else
            {
                int pastIndex=hm.get(nums[i]); 
                if(Math.abs(pastIndex-i)<=k)
                {
                    return true;
                }
               hm.put(nums[i], i); 
            }
        
        }
    return false;
	}

}
