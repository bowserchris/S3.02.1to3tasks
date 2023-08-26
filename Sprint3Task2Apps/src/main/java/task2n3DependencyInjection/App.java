package task2n3DependencyInjection;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		InternationalRate baseEuroPrice;
		
		List<Item> itemList = createList();
		itemList.forEach(System.out::print);
		
		System.out.println();
		
		System.out.println("The price for the items in dollars is: "); 
		baseEuroPrice = new ExchangeRateDollar();
		convertCurrency(itemList, baseEuroPrice);
		
		System.out.println();
		
		System.out.println("The price for the items in roubles is: ");
		baseEuroPrice = new ExchangeRateRouble();
		convertCurrency(itemList, baseEuroPrice);
		
		System.out.println();
		
		System.out.println("The price for the items in yuan is: ");
		baseEuroPrice = new ExchangeRateYuan();
		convertCurrency(itemList, baseEuroPrice);

	}
	
	public static List<Item> createList()  {
		List<Item> list = new ArrayList();
		list.add(new Item(3.0, "beer"));
		list.add(new Item(40, "shoe"));
		list.add(new Item(1300, "rent"));
		list.add(new Item(12, "menu"));
		list.add(new Item(1.5, "candy"));
		return list;
	}
	
	public static void convertCurrency(List<Item> list, InternationalRate rate) {
		CurrencyConverter convert = new CurrencyConverter(rate);
		convert.convertPrice(list);
	}

}

/*Level 3
Dependency Injection

Design a class that displays the price of various items on the screen. Since you
 will have to show them in several types of currency as well.

important

Make sure to add as a Dependency Injection a CurrencyConverter class that performs
 the price correction based on the currency exchange.
 * 
 * */

