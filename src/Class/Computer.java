package Class;
/**
 * @author arka
 * @version 15 March 2016
 */

public class Computer {
	public int processorFreq;
	public int ram;
	Computer(int processorFreq, int ram) {
		this.processorFreq = processorFreq;
		this.ram = ram;
	}
	public int getProcessorFreq(){
		return this.processorFreq;
	}
	public int getRAM() {
		return this.ram;
	}
}