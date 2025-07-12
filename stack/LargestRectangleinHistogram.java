package Stacks;

import java.util.Stack;

public class LargestRectangleinHistogram {

	public static void main(String[] args) {
		
		int[] heights = {2,1,5,6,2,3};
		
		int res=largestRectangleArea(heights);
		System.out.println(res);

	}

	private static int largestRectangleArea(int[] heights) {
		Stack<Integer> stack=new Stack<>();

        int min=Integer.MAX_VALUE;

        for(int i=0;i<heights.length;i++){
            if(!stack.isEmpty() && stack.peek() <= heights[i]){
                min=stack.peek();
            }else{
                stack.push(heights[i]);
                min=heights[i];
                continue;
            }
            stack.push(heights[i]);
        }

        return min*2;
	}

}
