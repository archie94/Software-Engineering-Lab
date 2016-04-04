package Class;

import java.awt.*;
import java.applet.*;

public class SplitNamesApplet extends Applet{

	Button splitName;
	Label info;
	TextField input, outputFirstName, outputLastName;
	String name, firstName, lastName;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		info = new Label("Enter Name : ");
		input = new TextField(100);
		splitName = new Button("Split");
		outputFirstName = new TextField(100);
		outputLastName = new TextField(100);
		add(info);
		add(input);
		add(splitName);
		add(outputFirstName);
		add(outputLastName);
		
	}
}
