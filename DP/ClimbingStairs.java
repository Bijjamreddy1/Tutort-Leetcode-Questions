package DynamicProgramming;

public class ClimbingStairs {

	public static void main(String[] args) {

		int n = 6;
		
		int res=climbStairs(n);
		System.out.println(res);
	}

	private static int climbStairs(int n) {
		
		int[] dp=new int[n+1];  // SC: O(N) - Nth Stair result also included -> N+1

        if(n==1 || n==2){
            return n;
        }

        // dp[0] = 0;

        dp[1]= 1; // [1]
        dp[2] = 2;//[1,1],[2]

     // dp[3] = 3   [1,1,1], [1,2],[2,1] = dp[2] + dp[1]
        int i=0;
        // int mod=1000000007;

        for (i=3; i<=n; i++)  // TC: O(N)
        {
            // int c = a + b; -- OVERFLOW
		    // int c = ((a%mod) + (b%mod))% mod -- No OVERFLOW
            // (a + b) % m = ((a % m) + (b % m)) % m

            dp[i] = ((dp[i-1]) + (dp[i-2])); // Avoid Overflow
        }
      
      return dp[n]; // Nth Stair to reach using 1 or 2 steps

	}

}
