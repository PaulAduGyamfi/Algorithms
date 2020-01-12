public class Stock {
	public static void main(String[] args) {
	Stock testStock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
	System.out.println("Stock Symbol: "+ testStock.symbol);
	System.out.println("Stock Name: "+ testStock.name);
	System.out.println("Previous-Closing-Price: "+ testStock.previousClosingPrice );
	System.out.println("Current-Price: "+ testStock.currentPrice );
	System.out.println("Price-Change Percentage: "+ testStock.getChangePercent() + " %"  );

	
	}
	
	 String symbol;
	 String name;
	 double previousClosingPrice;
	 double currentPrice;
	
	public Stock(String newSymbol, String newName, double newClosePrice, double newCurrentPrice ){
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newClosePrice;
		currentPrice = newCurrentPrice;
	}
	
	public double getChangePercent() {
		double stepOne = currentPrice - previousClosingPrice;
		double stepTwo = stepOne / previousClosingPrice;
		double changePercentage = stepTwo * 100;
		return changePercentage;
	}
}
