package tutort;

import java.util.Scanner;

public class ReverseVowelsInString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str=sc.next();
		int n=str.length();
		
		String vowels="";
		String output="";
		
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
					str.charAt(i) == 'i' ||  str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				vowels +=str.charAt(i);
			}
			
		}
		System.out.println(vowels);
		int m=vowels.length();
		String rev="";
		
		for(int j=0; j<m;j++) {
			
			rev += vowels.charAt(m-j-1);
		
			
		}
		System.out.println(rev);
		int len=rev.length();
		

		for(int k=0; k<n; k++) {
			for(int l=0; l<len;l++) {
			if(str.charAt(k) == 'a' || str.charAt(k) == 'e' || 
					str.charAt(k) == 'i' ||  str.charAt(k) == 'o' || str.charAt(k) == 'u' ) {
				
					String newStr=str.replace(str.charAt(k), rev.charAt(l));
					System.out.println(newStr);
					break;
				}
				
			}
				
		}
		
	}

}
