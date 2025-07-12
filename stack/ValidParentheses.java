package Stacks;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String s = "()[]{}";
		
		 boolean res= isValid(s);
		 System.out.println(res);
	}

	private static boolean isValid(String s) {
		
		if(s==""){
            return true;
        }
        if(s.length() % 2 !=0){
            return false;
        }

        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']'){
            return false;
        }

        Stack<Character> stack=new Stack<Character>();
        
        

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='(' || c=='{' || c=='[' ){
                stack.push(c);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }

            char check;
            switch(c){
                case ')':
                check=stack.peek();
                if(check == '{' || check == '['){
                    return false;
                }
                stack.pop();
                break;
                

                case '}':
                check=stack.peek();
                if(check == '(' || check == '['){
                    return false;
                }
                stack.pop();
                break;
                

                case ']':
                check=stack.peek();
                if(check == '{' || check == '('){
                    return false;
                }
                stack.pop();
                break;
                
            }
            

        }
        return stack.isEmpty();
	}

}
