package tutort;

public class ThreeConsecutiveOdds {

	public static void main(String[] args) {

		int[] arr = {1,2,34,3,4,5,7,23,12};
		
		boolean res=threeConsecutiveOdds(arr);
		System.out.println(res);
		
	}

	private static boolean threeConsecutiveOdds(int[] arr) {
		int count=0;
		
		for(int i:arr) {
			if(i % 2 ==1) count++;
			else count=0;
			if(count==3) {
				return true;
			}
		}
		return false;
	}

}
