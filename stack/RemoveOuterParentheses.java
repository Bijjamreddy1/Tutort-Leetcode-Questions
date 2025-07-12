package Stacks;

import java.util.Stack;

public class RemoveOuterParentheses {

	public static void main(String[] args) {

		String s = "(()())(())";
		
		String res=removeOuterParentheses(s);	
		System.out.println(res);
	}

	private static String removeOuterParentheses(String s) {
		
		int count=0;
		StringBuilder str=new StringBuilder();
		Stack<Character> st=new Stack<Character>();
		
		
		for(char ch:s.toCharArray()) {
			
			if(ch == '(') {
				if(count !=0) {
					str.append(ch);
				}
				count++;
			}
			else
			{
				if(count !=1) {
					str.append(ch);
					
				}
				count--;
			}
		}
		
		return str.toString();
	}

}
