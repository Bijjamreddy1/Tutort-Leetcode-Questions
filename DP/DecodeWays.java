package DynamicProgramming;

public class DecodeWays {

	public static void main(String[] args) {

		String s = "226";
		
		int res=DecodeWays(s);
		System.out.println(res);
	}

	private static int DecodeWays(String s) {
		int n=s.length();

        if(n==0 || s==null){
            return 0;
        }

        int[] dp=new int[n+1];

        if(s.charAt(0) == '0'){
            return 0;
        }

        dp[0]=1;

        for(int i=1;i<n;i++){

            int first=Integer.valueOf(s.substring(i, i+1));
            int second=Integer.valueOf(s.substring(i-1, i+1));


            if(first >=1 && first <=9){
                dp[i] +=dp[i-1];
            }

            if(second >=10 && second <=26){
                if(i>=2){
                    dp[i] +=dp[i-2];
                }
                else{
                    dp[i] +=1;
            }
        }

        

    }
    return dp[n-1];
	}

}
