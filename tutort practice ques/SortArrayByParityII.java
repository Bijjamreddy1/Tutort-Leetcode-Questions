package tutort;

public class SortArrayByParityII {

	public static void main(String[] args) {

		int[] nums = {4,2,5,7};
		
		
		int[] res=sortArrayByParityII(nums);
		
		System.out.println(res);

	}

	private static int[] sortArrayByParityII(int[] nums) {
		int n=nums.length;

		int even=0;
		int odd=1;

		int[] result=new int[n];
		
		for(int i:nums) {
			if(i%2==0) {
				result[even]=i;
				even+=2;
			}
			else {
				result[odd]=i;
				odd+=2;
			}
		}
		
		return result;
	}

}
