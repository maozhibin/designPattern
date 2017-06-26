package strategyAndFactory;

public class DiscountPay implements MarketStrategy {

	@Override
	public void discount() {
		System.out.println("有折扣，打8折.");
	}

}
