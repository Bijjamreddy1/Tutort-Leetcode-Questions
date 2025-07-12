package tutort;

public class Findfirstnonrepeatingcharacter {

	public static void main(String[] args) {

		String s = "leetcode";
		
		int res= firstUniqChar( s);
		System.out.println(res);
	}

	private static int firstUniqChar(String s) {
		
		int[] freq=new int[26];

        int i=0;

        for(i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;

	}
}
