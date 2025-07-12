package Stacks;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {

		String[] ops = {"5","-2","4","C","D","9","+","+"};
		
		int res=calPoints(ops) ;
		System.out.println(res);
		
	}

	private static int calPoints(String[] ops) {
		
		int n=ops.length;

        Stack<Integer> s=new Stack<>();

        for(int i=0;i<n;i++){
            if(ops[i].equals("+")){
                int a=s.pop();
                int b=s.pop();
                int c=a+b;
                s.push(a);
                s.push(b);
                s.push(c);
            }
            else if(ops[i].equals("D")){
                int a=s.peek();
                int x=a*2;
                s.push(x);
            }
            else if(ops[i].equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(ops[i]));
            }
        }

        int sum=0;
        while(!s.isEmpty()){
            sum +=s.pop();
        }
        return sum;
	}

}
