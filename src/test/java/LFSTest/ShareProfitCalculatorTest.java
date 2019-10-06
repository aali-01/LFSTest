package LFSTest;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShareProfitCalculatorTest 
{ 
	
	@Test
	public void testCalculateHighestProfitWithOnlyOneValue() {
		int stockPricesYesterday[] = {10}; 
		int profit = ShareProfitCalculator.calculateHighestProfit(stockPricesYesterday);
		assertEquals(0, profit);
	}
	
	@Test
	public void testCalculateHighestProfitWithOnlyTwoValues() {
		int stockPricesYesterday[] = {10, 12}; 
		int profit = ShareProfitCalculator.calculateHighestProfit(stockPricesYesterday);
		assertEquals(2, profit);
	}
	
	
	@Test
	public void testCalculateHighestProfit1() {
		int stockPricesYesterday[] = {10, 7, 5, 8, 11, 9}; 
		int profit = ShareProfitCalculator.calculateHighestProfit(stockPricesYesterday);
		assertEquals(6, profit);
	}
	
	@Test
	public void testCalculateHighestProfit2() {
		int stockPricesYesterday[] = {5, 4, 6, 11, 2, 5, 8}; 
		int profit = ShareProfitCalculator.calculateHighestProfit(stockPricesYesterday);
		assertEquals(7, profit);
	}
	
	@Test
	public void testCalculateHighestProfit3() {
		int stockPricesYesterday[] = {1,2,3,4,5,6,7,8,10}; 
		int profit = ShareProfitCalculator.calculateHighestProfit(stockPricesYesterday);
		assertEquals(9, profit);
	}
	
}