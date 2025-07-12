package tutort;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

	public static void main(String[] args) {

		String[] words = {"bella","label","roller"};
		
		List<String> ls=commonChars(words);
	
	}

	private static List<String> commonChars(String[] words) {
		List<String> result = new ArrayList<>();
        for (char ch='l'; ch<='z'; ch++) {
            int minFreq = 101;
            for (String word: words) {
                int count = 0;
                for (int i=0 ;i< word.length(); i++) {
                    if (word.charAt(i) == ch)
                        count++;
                }
                minFreq = Math.min(minFreq, count);
            }
            
            while (minFreq-- > 0) {
                result.add("" + ch);
            }
        }
        return result;
	}

}
