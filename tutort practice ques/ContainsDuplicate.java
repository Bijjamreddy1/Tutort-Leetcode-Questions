package tutort;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		
		boolean value=containsDuplicate(nums);
		System.out.println(value);
		
	}

	private static boolean containsDuplicate(int[] nums) {
		
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(i != j) {
					if(nums[i] ==nums[j]) {
						return true;
					}
				}
				
			}
			
		}
		return false;
		
		

		
	}

}
