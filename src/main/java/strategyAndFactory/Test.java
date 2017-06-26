package strategyAndFactory;

public class Test {
	public static void main(String[] args) {
		CustomContext c = new CustomContext();
		c.pay(c.consumeCash(100));
		c.pay(c.consumeCash(600));
		c.pay(c.consumeCash(1100));
	}
}