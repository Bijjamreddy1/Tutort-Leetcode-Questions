package tutort;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElementI {

	public static void main(String[] args) {

		int[] nums1 = {1,3,5,2,4}, nums2 = {6,5,4,3,2,1,7};
		
		nextGreaterElement(nums1, nums2);
		
	}

	private static void nextGreaterElement(int[] nums1, int[] nums2) {

		int m=nums1.length;
		int n=nums2.length;
		
		
		int nextval ;
		
		
		List<Integer> arr=new ArrayList<Integer>();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(nums1[i] == nums2[j]) {
					nextval=nums2[j];
					if(j+1 == nums2.length) {
						System.out.println("-1");
						arr.add(-1);
						break;
					}
					else if(nums2[j+1] >nextval) {
						nextval=nums2[j+1];
						System.out.println(nextval);
						arr.add(nextval);
						nextval=0;
						break;
					}
					else {
						arr.add(-1);
						System.out.println("-1");
						break;
					}
				}
			}
		}
		
		int[] res=new int[arr.size()];
		
		for(int k=0;k<arr.size();k++) {
			res[k] =arr.get(k);
		}
		System.out.println(res);
	}

}
