package task2n1Observer;

public class StockAgency implements Observer {
	
	private double price1;
	private double price2;
	private double price3;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockExchange;
	
	public StockAgency(Subject stockExchange) {
		this.stockExchange = stockExchange;
		this.observerID = ++observerIDTracker;
		System.out.println("New observer " + observerID);
		
		stockExchange.register(this);		//invokes register method and inputs the current observer object being created into the exchange arraylist.
	}

	@Override
	public void update(double price1, double price2, double price3) {

		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		
		printThePrices();
		
	}
	
	public void printThePrices() {
		System.out.println("Registered Stock Agent ID: " + observerID + "\nPrice1 : " + price1 + "\nPrice2 : " + price2 + "\nPrice3 : " + price3 + "\n");
	}

}
