package factory;

/**
 * 得到自行车
 * 
 * @author Administrator
 *
 */
public class BikeGet implements ICarFactory {

	@Override
	public Car getCar() {
		return new Bike();
	}

}
