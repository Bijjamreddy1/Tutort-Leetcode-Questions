package strings;

import java.util.Arrays;

public class IsomorphicStrings {

	public static void main(String[] args) {

		String s = "paper", t = "title";
		
		boolean res= isIsomorphic(s, t);
		System.out.println(res);
	}

	private static boolean isIsomorphic(String s, String t) {
		
		int map1[]=new int[26];
        int map2[]=new int[26];//Initialises with zeros
        if(s.length()!=t.length())
            return false;
        for(int idx=0;idx<s.length();idx++)
        {
            if(map1[s.charAt(idx)]!=map2[t.charAt(idx)])
                return false;
            map1[s.charAt(idx)]=idx+1;
            map2[t.charAt(idx)]=idx+1;
        }
        return true;
	    
	}

}
