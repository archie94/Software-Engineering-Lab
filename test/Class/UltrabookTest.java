package Class;

import junit.framework.TestCase;


public class UltrabookTest extends TestCase{

	private int processorFreq,ram,screenSize,numOfPorts;
	private Ultrabook ultrabook;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		processorFreq = 33;
		ram = 6;
		screenSize = 13;
		numOfPorts = 2;
		ultrabook = new Ultrabook(processorFreq, ram, screenSize, numOfPorts);
	}

	public void testInfo(){
		assertEquals("33 6 13 2", ultrabook.getInfo());
	}

}