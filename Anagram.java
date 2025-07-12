package tutort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {

		String s = "anagram", t = "nagaram";
		
		boolean res= isAnagram( s,  t);
		System.out.println(res);
	}

	private static boolean isAnagram(String s, String t) {
		
		if(s.length() !=t.length()){
            return false;
        }
        if(s==t){
            return true;
        }
        
        
//        char[] s1=s.toCharArray();
//        char[] s2=t.toCharArray();
//        
//        Arrays.sort(s1);
//        Arrays.sort(s2);
//        
//        
//        
//        
//        return Arrays.equals(s1, s2);
        
//        int[] arr=new int[26];
//        int i=0;
//
//        for(i=0;i<s.length();i++){
//            arr[s.charAt(i)-'a']++;
//            arr[t.charAt(i)-'a']--;
//
//        }
//
//        for(i=0;i<26;i++){
//            if(arr[i] !=0){
//                return false;
//            }
//            
//        }
//
//        return true;
        
        
        Map<Character, Integer> hm1=new HashMap<Character, Integer>();
        Map<Character, Integer> hm2=new HashMap<Character, Integer>();

        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        
        
        
        int i=0;
        
        for(i=0;i<arr1.length;i++) {
        	if (hm1.get(arr1[i]) == null) { 
        		 
        		hm1.put(arr1[i], 1); 
            } 
            else { 
                Integer c = (int)hm1.get(arr1[i]); 
                hm1.put(arr1[i], ++c); 
            } 
        	
        }
        
        for(int j=0;j<arr2.length;j++) {
        	if (hm2.get(arr2[j]) == null) 
        		hm2.put(arr2[j], 1); 
            else { 
 
                Integer d = (int)hm2.get(arr2[j]); 
                hm2.put(arr2[j], ++d); 
            } 
        	
        }
        
        if(hm1.equals(hm2)) {
        	return true;
        }else {
        	return false;
        }
	}

}
