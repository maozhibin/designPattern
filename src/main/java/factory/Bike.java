package factory;

/**
 * 具体产品角色，自行车
 * 
 * @author Administrator
 *
 */
public class Bike implements Car {

	@Override
	public void gotowork() {
		System.out.println("骑自行车上班咯");
	}

}
