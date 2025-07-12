package Stacks;

import java.util.Stack;

public class BackspaceStringCompare {

	public static void main(String[] args) {

		String s = "y#fo##f", t = "y#f#o##f";
		
		boolean res= backspaceCompare( s,  t) ;
		System.out.println(res);
	}

	private static boolean backspaceCompare(String s, String t) {
		int n=s.length();
        int m=t.length();
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();

        for(int i=0;i<n;i++){
            Character ch=s.charAt(i);
            if(!st1.isEmpty() && ch=='#'){
                st1.pop();
            }else{
            	if(ch == '#') {
            		continue;
            	}
            	else {
            		st1.push(s.charAt(i));
            	}
                
            }
        }

        for(int i=0;i<m;i++){
            Character ch=t.charAt(i);
            if(!st2.isEmpty() && ch=='#'){
                st2.pop();
            }else{
            	if(ch == '#') {
            		continue;
            	}
            	else {
            		st2.push(t.charAt(i));
            	}
                
            }
        }

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        while(!st1.isEmpty()){
            sb1.append(st1.pop());
        }

        
        while(!st2.isEmpty()){
            sb2.append(st2.pop());
        }

        return ((sb1.reverse().toString()).equalsIgnoreCase(sb2.reverse().toString()));
	}

}
