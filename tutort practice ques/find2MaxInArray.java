package tutort;

import java.util.Arrays;

public class find2MaxInArray {

	public static void main(String[] args) {

		int[] arr= {4,1};
		int n=arr.length;
		
		
		find2Max(arr, n);
		
	}

	private static void find2Max(int[] arr, int n) {
		
		//1st method
		
		Arrays.sort(arr);
		System.out.println(arr[n-1]);
		System.out.println(arr[n-2]);
		
	
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		if(n<2) {
			System.out.println("Invalid Input");
		}else {
			
			for(int i=0; i<n;i++) {
				if(arr[i]>first) {
					second=first;
					first=arr[i];
				}
				else if(arr[i]>second) {
					second=arr[i];
				}
				
			}
			System.out.println(first);
			System.out.println(second);
		}
	}

	

}
