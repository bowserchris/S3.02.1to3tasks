package task2n1Observer;			//source: derek banas youtube channel video observer design pattern

public class Main {

	public static void main(String[] args) {

		StockExchange exchange = new StockExchange();
		
		StockAgency agent1 = new StockAgency(exchange);
		
		exchange.setPrice1(197.00);
		exchange.setPrice2(677.60);
		exchange.setPrice3(676.40);
		
		StockAgency agent2 = new StockAgency(exchange);
		
		exchange.unregister(agent1);
		
		exchange.setPrice1(200.00);
		exchange.setPrice2(650.60);
		exchange.setPrice3(666.40);
		
		

	}

}

/*
 * Let's dive deeper into software construction patterns. Think carefully
 *  before building your software!!!
Level 1

In all exercises, create a Gradle project with a Main class that demonstrates
 the use of the pattern (with any invocations that are needed).
observe

Design a system in which a Stock Exchange Agent (Observable) notifies several 
Stock Exchange agencies (Observers) of changes when the Stock Exchange goes up or down.

    It is necessary for the Observable object to hold references to the Observers.

Level 2
Callback

Simulates a payment gateway that receives an object encapsulating the payment 
method to be made: credit card, Paypal or bank account debt.

    The gateway will invoke the payment without knowing the form and returning 
    control to the parent class.
    The class that invokes the payment gateway will be a shoe store.

Level 3
Dependency Injection

Design a class that displays the price of various items on the screen. Since you
 will have to show them in several types of currency as well.

important

Make sure to add as a Dependency Injection a CurrencyConverter class that performs
 the price correction based on the currency exchange.
 * 
 * 
 * */
