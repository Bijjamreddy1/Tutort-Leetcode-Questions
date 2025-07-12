package tutort;

public class DuplicateZeros {

	public static void main(String[] args) {

		int[] arr = {1,2,3};
		
		
		int[] ar=new int[arr.length];

		int index=0;
		for(int i=0;index<arr.length;i++) {
			if(arr[i]==0) {
				ar[index]=0;
				index++;
				ar[index]=0;
			}else {
				ar[index]=arr[i];
			}
			index++;
		}
		
		
		
		
		
	}

}
