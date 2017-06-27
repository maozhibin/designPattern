package agent;

/**
 * 追求者
 * 
 * @author Administrator
 *
 */
public class Pursuer implements Agent {
	private String name;

	public Pursuer(String name) {
		this.name = name;
	}

	@Override
	public void giveFreshFlower() {
		System.out.println("送鲜花");
	}

	@Override
	public void giveGift() {
		System.out.println("送礼物");
	}

	@Override
	public void giveEat() {
		System.out.println("请吃饭");
	}

}
