package agent;

/**
 * 代理者
 * 
 * @author Administrator
 *
 */
public class Proxy implements Agent {
	Pursuer pursuer;

	public Proxy(String name) {
		pursuer = new Pursuer(name);
	}

	@Override
	public void giveFreshFlower() {
		pursuer.giveFreshFlower();
	}

	@Override
	public void giveGift() {
		pursuer.giveGift();
	}

	@Override
	public void giveEat() {
		pursuer.giveEat();
	}

}
