package tutort;

public class BuyAndSellStock {

	public static void main(String[] args) {

		int[] prices = {7,1,5,3,6,4};
		
		int n=prices.length;
		
		int buy=Integer.MAX_VALUE, sell=0, output=0;
		
		for(int i=0; i<n; i++) {
			
			if(prices[i] <buy) {
				buy=prices[i];
			}
			
			sell=prices[i]-buy;
			if(output<sell) {
				output=sell;
			}
			
			
			
		}
		System.out.println(output);
		
	}

}
