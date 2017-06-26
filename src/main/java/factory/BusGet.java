package factory;

/**
 * 得到汽车
 * 
 * @author Administrator
 *
 */
public class BusGet implements ICarFactory {
	@Override
	public Car getCar() {
		return new Bus();
	}

}
