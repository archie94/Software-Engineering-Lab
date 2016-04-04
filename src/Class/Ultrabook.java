package Class;
/**
 * 
 * @author arka
 * @version 15 March 2016
 */
public class Ultrabook extends Laptop{

	public int numOfPorts;
	public Ultrabook(int processorFreq, int ram, int screenSize, int numOfPorts) {
		super(processorFreq, ram, screenSize);
		this.numOfPorts = numOfPorts;
	}
	public int getProcessorFreq(){
		return super.getProcessorFreq();
	}
	public int getRAM() {
		return super.getRAM();
	}
	public int getScreenSize() {
		return super.getScreenSize();
	}
	public int getNumOfPorts(){
		return this.numOfPorts;
	}
	public String getInfo(){
		return ""+getProcessorFreq()+" "+getRAM()+ " "+getScreenSize()+ " "+getNumOfPorts();
	}
}