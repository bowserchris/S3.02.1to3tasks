package task2n2Callback;

public class PaymentGateway {
	
	private Sale sale;
	
	public PaymentGateway(Sale sale) {
		this.sale = sale;
	}
	
	public void processingSale() {
		System.out.println("Payment of " + sale.getType() + " is being processed.");
		sale.callback();
	}

}
