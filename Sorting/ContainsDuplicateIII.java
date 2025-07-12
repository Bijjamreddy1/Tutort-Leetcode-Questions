package SortingQuestions;

import java.util.SortedSet;
import java.util.TreeSet;

public class ContainsDuplicateIII {

	public static void main(String[] args) {

		int[] nums = {1,2,3,1};
		
		int indexDiff = 3, valueDiff = 0;
		
		boolean res=containsNearbyAlmostDuplicate(nums, indexDiff,valueDiff);
		System.out.println(res);
	}

	private static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

		if (indexDiff < 1 || valueDiff < 0)
            return false;
        SortedSet<Long> set = new TreeSet<Long>();
        for (int j = 0; j < nums.length; j++) 
        {
            long leftBoundary = (long) nums[j] - valueDiff;
            long rightBoundary = (long) nums[j] + valueDiff + 1;
            SortedSet<Long> subSet = set.subSet(leftBoundary, rightBoundary);
            if (!subSet.isEmpty())
                return true;
            set.add((long) nums[j]);
            if (j >= indexDiff) 
            {
                set.remove((long) nums[j - indexDiff]);
            }
        }
        return false;
	}

}
