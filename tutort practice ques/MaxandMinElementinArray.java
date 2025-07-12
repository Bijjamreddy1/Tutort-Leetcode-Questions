package tutort;

import java.util.Arrays;

public class MaxandMinElementinArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		
		maxandMinElement(arr, n);
		
	}

	private static void maxandMinElement(int[] arr, int n) {
		
		///1st Way
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[n-1]);
		
		
		
		//2nd method
		int max=arr[0], min = arr[0];
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
		}
		
		for(int num:arr) {
			if(num<min) {
				min=num;
			}
		}
		System.out.println(min);
		System.out.println(max);
		
		//3rd way
		
		int maximum=arr[0], minimum = arr[0];
		for(int num:arr) {
			if(num>maximum) {
				maximum=num;
			}

			if(num<minimum) {
				min=minimum;
			}
		}
		System.out.println(minimum);
		System.out.println(maximum);
		
	
		
	}

	

}
