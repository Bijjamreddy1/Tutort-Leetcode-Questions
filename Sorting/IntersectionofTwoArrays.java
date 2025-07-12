package SortingQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		int[] res=intersection(nums1,nums2);
		
		System.out.println(res);
		
	}

	private static int[] intersection(int[] nums1, int[] nums2) {
		
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		Set<Integer> a=new HashSet<Integer>();

        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                a.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }

        }

        int[] ans=new int[a.size()];

        int idx=0;
        for(int k:a){
            ans[idx++]=k;
        }
        return ans;
	}
	
}
