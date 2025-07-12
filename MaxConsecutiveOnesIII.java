package tutort;

public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {

		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		
		int res=longestOnes(nums, k);
		
	}

	private static int longestOnes(int[] nums, int k) {
		
		int ans=0;
        int i=0,j=0;
        int l=nums.length;
        while(i<l){
          if(nums[i]==0){
            k--;
          }
          if(k<0 && nums[j++]==0){
            k++;
            
          }
          i++;
        }
        return i-j;
	}

}
