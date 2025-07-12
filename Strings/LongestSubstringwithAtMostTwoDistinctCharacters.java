package strings;

public class LongestSubstringwithAtMostTwoDistinctCharacters {

	public static void main(String[] args) {

		String s="eceab";
		
		int res=lengthOfLongestSubstringTwoDistinct(s);
		System.out.println(res);
	}

	private static int lengthOfLongestSubstringTwoDistinct(String s) {

        int[] freq=new int[128];

        int left=0,right=0;
        int ans=0,n=s.length(),k=2;
        int uniqueCharCount=0;

        while(right < n){

            if(freq[s.charAt(right++)]++ == 0){
                uniqueCharCount++;

                while(uniqueCharCount >k){
                    if(--freq[s.charAt(left++)] == 0){
                        uniqueCharCount --;
                    }
                }
            }
         ans=Math.max(ans, right-left);

        }
        return ans;
	}

}
