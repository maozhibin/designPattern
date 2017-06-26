package strategyAndFactory;

public class CashBackPay implements MarketStrategy {

	@Override
	public void discount() {
		System.out.println("有返现，返100.");
	}
}
