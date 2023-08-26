package task2n3DependencyInjection;

public class Item {
	
	private double price;
	private String name;
	
	public Item(double price, String name) {
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "The price is " + String.format("%.2f", price) + "€ for the item " + name + ".\n";
	}
	
	

}
