package tutort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindMajorityElements {

	public static void main(String[] args) {

		int[] nums = {1,2};
		
		List<Integer> majority=majorityElement(nums);
		System.out.println(majority);
		
	}

	private static List<Integer> majorityElement(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();
	    int k = nums.length / 3 + 1, i;
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int num : nums){
	        i = map.containsKey(num)? map.get(num) + 1 : 1;
	        map.put(num, i);
	        if(i == k)
	            list.add(num);
	    }
	    return list;
	}

}
