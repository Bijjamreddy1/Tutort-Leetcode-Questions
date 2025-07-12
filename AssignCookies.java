package tutort;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {

		int[] g = {1,2,3}, s = {1,1};
		
		int res=findContentChildren(g,s) ;
		System.out.println(res);
	}

	private static int findContentChildren(int[] g, int[] s) {

		
		Arrays.sort(g);
		Arrays.sort(s);
		
		String a="10";
		String b="10";
		
		System.out.println(a==b);
		System.out.println((a.equals(b)));
		
		int i=0, j=0, m=g.length, n=s.length;
		
		while(i<m && j < n) {
			if(s[j] >=g[i]) {
				i++;
			}
			j++;
		}
		return i;
	}

}
