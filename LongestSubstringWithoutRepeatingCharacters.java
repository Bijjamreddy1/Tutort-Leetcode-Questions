package tutort;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String s = "abcabcbb";
		
		int res=lengthOfLongestSubstring(s);
		System.out.println(res);
	}

	private static int lengthOfLongestSubstring(String s) {
		int i=0,j=0,max=0;

        //use HashSet to store unique characters
        HashSet<Character> set=new HashSet<Character>();

        while(j<s.length()){
            //if not contained in Set, add value to set and increase the window size
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,set.size()); //get the maximum
            }
            else{

                //if already present, decrease the window size by remove the 'i' index value and move to i++;
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max; //return the max size of set
	}

}
