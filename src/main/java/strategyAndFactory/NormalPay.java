package strategyAndFactory;

public class NormalPay implements MarketStrategy {

	@Override
	public void discount() {
		System.out.println("不打折");
	}
}
