package tutort;

public class ArrayAssignments {

	public static void main(String[] args) {

		int[] arr={1,2,3,4,5};
        int n=arr.length;
        
         sumArray(arr,n);
	}

	private static void sumArray(int[] arr, int n) {
		int i=0, sum=0;
        for(i=0;i<n;i++){
            sum=sum+arr[i];
            
        }
        System.out.print(sum);
	}

}
