package task2n1Observer;

import java.util.ArrayList;

public class StockExchange implements Subject {

	private ArrayList<Observer> observers;
	private double price1;
	private double price2;
	private double price3;
	
	public StockExchange() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		
		int observerIndex = observers.indexOf(deleteObserver);
		
		System.out.println("Agent " + (observerIndex+1) + " has been unregistered.");
		
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		
		for(Observer observer : observers) {
			observer.update(price1, price2, price3);
		}
		
	}
	
	public void setPrice1(double newPrice) {
		this.price1 = newPrice;
		notifyObserver();
	}
	
	public void setPrice2(double newPrice) {
		this.price2 = newPrice;
		notifyObserver();
	}
	
	public void setPrice3(double newPrice) {
		this.price3 = newPrice;
		notifyObserver();
	}

}
