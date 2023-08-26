package task2n3DependencyInjection;

import java.util.List;

public class CurrencyConverter {
	
	InternationalRate rate;
	
	public CurrencyConverter(InternationalRate rate) {
		this.rate = rate;
	}
	
	public void convertPrice(List<Item> list) {
		list.forEach(s -> System.out.println("The "+ s.getName() + " has a price of " + String.format("%.2f", s.getPrice() * rate.convert()) + "."));
	}

}
