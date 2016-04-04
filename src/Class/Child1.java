package Class;
/**
 * 
 * @author arka
 * @version 15 March 2016
 */
public class Child1 extends Parent1{

	int var1,var2;
	public Child1(int var1, int var2){
		super(var1,var2);
		this.var1 = var1;
		this.var2 = var2;
	}
	public int arithmatic(){
		return var1*var2;
	}
}