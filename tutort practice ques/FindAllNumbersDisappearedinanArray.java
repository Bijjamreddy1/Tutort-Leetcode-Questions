package tutort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {

		int[] nums = {4,3,2,7,8,2,3,1};
		
		List<Integer> res=findDisappearedNumbers(nums);
		
		Arrays.sort(nums);
		
		
		
		
	}

	private static List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> s=new HashSet<Integer>();
		
		for(int n:nums) {
			s.add(n);
		}
		
		List<Integer> li=new ArrayList<Integer>();
		
		for(int i=1;i<nums.length-1;i++) {
			if(!s.contains(i)) {
				li.add(i);
			}
		}
		
		return li;
	}

}
