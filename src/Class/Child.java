package Class;

/**
 * A child class of Base class
 * @author nitdgp
 * @version 
 */
public class Child extends Base1 implements Base2{

	public static double radius;
	
	
	public static double volume(){
		return area(radius)*radius;
	}


	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Circle info");
	}

}