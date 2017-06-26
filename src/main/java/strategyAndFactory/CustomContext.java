package strategyAndFactory;

class CustomContext {
	// 简单工厂模式，注意此处与上一篇策略模式Blog中写法的区别
	// 此处我们进行了解耦
	public MarketStrategy consumeCash(int num) {
		if (num >= 1000) {
			return new CashBackPay();
		} else if (num >= 500 && num < 1000) {
			return new DiscountPay();
		} else {
			return new NormalPay();
		}
	}

	public void pay(MarketStrategy m) {
		m.discount();
	}
}
