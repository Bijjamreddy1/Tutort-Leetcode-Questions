package Stacks;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {

		String s = "abbaca";
		
		String res=removeDuplicates(s);
		
		
	}

	private static String removeDuplicates(String s) {
		
		Stack<Character> st=new Stack<>();

        // Process each character in the string
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek() ==s.charAt(i)){
                // Remove duplicate character
                st.pop();
            }
            else{
                // Push unique character
                st.push(s.charAt(i));
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
	}

}
