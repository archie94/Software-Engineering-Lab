package Class;
/**
 * 
 * @author arka
 * @version 15 March 2016
 */
public class Laptop extends Computer{

	public int screenSize;
	public Laptop(int processorFreq, int ram, int screenSize){
		super(processorFreq, ram);
		this.screenSize = screenSize;
	}
	public int getProcessorFreq(){
		return super.getProcessorFreq();
	}
	public int getRAM() {
		return super.getRAM();
	}
	public int getScreenSize() {
		return this.screenSize;
	}
}