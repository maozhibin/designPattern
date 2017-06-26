package factory;

public class Test {
	public static void main(String[] args) {
		ICarFactory factory = null;

		factory = new BikeGet();
		Bike bike = new Bike();
		bike.gotowork();

		factory = new BusGet();
		Bus bus = new Bus();
		bus.gotowork();

	}
}
