package tutort;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr= {1,2,4,5};
		
		int n=arr.length;
		
		reverse(arr,n);
		
		
	}

	private static void reverse(int[] arr, int n) {
		int start=0, end=n-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		
		}
		System.out.print("[");
		for(int num:arr) {
			System.out.print(num + " ");
	
	}
		System.out.print("]");

		
		
		
	}

}
