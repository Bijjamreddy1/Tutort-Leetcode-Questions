package tutort;

public class DecodeXORedArray {

	public static void main(String[] args) {

		int[] encoded = {1,2,3};
		int first = 1;
		
		 int[] res=decode( encoded, first) ;
		 System.out.println(res);
	
	}

	private static int[] decode(int[] encoded, int first) {
			
		int[] result=new int[encoded.length+1];
		
		result[0] =first;
		
		for(int i=0;i<encoded.length;i++) {
			result[i+1] = result[i] ^ encoded[i];
		}
		return result;
	
	}

}
