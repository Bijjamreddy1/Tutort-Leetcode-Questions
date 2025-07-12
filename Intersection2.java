package tutort;

import java.util.HashSet;

public class Intersection2 {

	public static void main(String[] args) {

		int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
		
		int[] value=intersection(nums1, nums2);
		System.out.println(value);
		
		
	}

	private static int[] intersection(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
		
		
		
		for(int i=0;i<nums1.length;i++) {
			set1.add(nums1[i]);
		}
		System.out.println(set1);
		
		for(int j=0;j<nums2.length;j++) {
			if(set1.contains(nums2[j])) {
				set2.add(nums2[j]);
			}
		}		
		System.out.println(set2);
		
		int[] result=new int[set2.size()];
		
		int index=0;
		for(Integer i:set2) {
			result[index] =i;
			index ++;	
		}

		return result;
	}

}
