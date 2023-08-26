package task2n2Callback;

public class Sale implements Callback {

	private double price;
	private String type;
	private Callback callback;
	
	PaymentGateway payment = new PaymentGateway(this);
	
	public void generateSale(double price, String type) {
		this.price = price;
		this.type = type;
		payment.processingSale();
	}

	@Override
	public void callback() {
		System.out.println("Payment by " + type + " has been verfied.\n"
				+ "Continuing with sale.");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Callback getCallback() {
		return callback;
	}

	public void setCallback(Callback callback) {
		this.callback = callback;
	}
	
	@Override
	public String toString() {
		return "The total sale price is: $" + price + ". The payment method is " + type + ".";
	}

}
