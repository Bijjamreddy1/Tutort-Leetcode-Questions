package tutort;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicateIII {

	public static void main(String[] args) {

		int[] nums = {1,2,3,1};
		int indexDiff = 3, valueDiff = 0;
		
		
		
		boolean res=containsNearbyAlmostDuplicate(nums, indexDiff,valueDiff) ;
		System.out.println(res);
	}

	private static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
		
		
        NavigableSet<Integer> sortedSet = new TreeSet<>();
	
		if(nums.length ==0 && nums.length ==1 && nums==null) {
			return false;
		}
		
		int n=nums.length;
		
		for(int i=0;i<n-1;i++) {
			int j=i+1;
			
			while(j <= i+indexDiff && j<=n-1) {
				int diff=Math.abs(nums[j]-nums[i]);
				
				if(diff <indexDiff) {
					return true;
				}
			}
			j++;
		}
		
		return false;
		
	}

}
