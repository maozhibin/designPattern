package Decorator;

/**
 * Created by Jiqing on 2016/10/14.
 */
public class Client {
	public static void main(String args[]) {
		Component component, componentSB, componentBB;
		component = new Window();
		componentSB = new ScrollBarDecorator(component);
		componentSB.display();
		System.out.println("--------------------");
		componentBB = new BlackBoarderDecorator(componentSB);
		componentBB.display();
	}
}