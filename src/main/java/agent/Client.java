package agent;

/**
 *
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		String name = "校花";
		Proxy proxy = new Proxy(name);
		proxy.giveFreshFlower();
		proxy.giveGift();
		proxy.giveEat();
	}
}
