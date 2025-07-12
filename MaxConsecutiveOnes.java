package tutort;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {

		int[] nums = {1,0,1,1,0,1};
		
		int res=findMaxConsecutiveOnes( nums) ;
		System.out.println(res);
	}

	private static int findMaxConsecutiveOnes(int[] nums) {
		
		
		int n=nums.length;
		
		int maxValue=Integer.MIN_VALUE;
		int count=0;
		for(int i:nums) {

			if(i !=1) {
				if(maxValue < count) {
					maxValue =count;
				}
				count=0;
			}
			else {
				count++;
				if(maxValue < count) {
					maxValue =count;
				}
				
			}

		}
		
		return maxValue;
	}

}
