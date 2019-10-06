package LFSTest;
class ShareProfitCalculator 
{ 
	public static int calculateHighestProfit(int stockPricesYesterday[]) 
	{ 
		if ( stockPricesYesterday.length == 1) {
			// it means that there was no trading
			return 0;
		}
		
		int maxDiff = stockPricesYesterday[1] - stockPricesYesterday[0]; 
		int minSharePrice = stockPricesYesterday[0]; 
		int i; 
		for (i = 1; i < stockPricesYesterday.length; i++) 
		{ 
			if (stockPricesYesterday[i] - minSharePrice > maxDiff) 
				maxDiff = stockPricesYesterday[i] - minSharePrice; 
			if (stockPricesYesterday[i] < minSharePrice) 
				minSharePrice = stockPricesYesterday[i]; 
		} 
		return maxDiff; 
	} 
	
	public static void main(String[] args) 
	{ 
		int stockPricesYesterday[] = {10, 7, 5, 8, 11, 9}; 
		System.out.println("Highest share profit made yesterday: " + 
				calculateHighestProfit(stockPricesYesterday)); 
	} 
}