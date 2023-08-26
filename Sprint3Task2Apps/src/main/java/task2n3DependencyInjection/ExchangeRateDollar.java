package task2n3DependencyInjection;

public class ExchangeRateDollar implements InternationalRate {

	@Override
	public double convert() {
		return 1.07;
	}

}
