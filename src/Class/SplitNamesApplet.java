package Class;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
/**
 * A Java Applet to split entered name into First Name and Last Name 
 * @author arka
 * @version 5 April 2016
 */
public class SplitNamesApplet extends Applet{

	Button splitName;
	Label info;
	TextField input, outputFirstName, outputLastName;
	static String name, firstName, lastName;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		info = new Label("Enter Name : ");
		input = new TextField(50);
		splitName = new Button("Split");
		outputFirstName = new TextField(50);
		outputLastName = new TextField(50);
		add(info);
		add(input);
		add(splitName);
		add(outputFirstName);
		add(outputLastName);
		splitName.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				name = input.getText();
				boolean isValid = getSplitName();
				if( isValid) {
					outputFirstName.setText(firstName);
					outputLastName.setText(lastName);
				}else {
					outputFirstName.setText("INVALID");
					outputLastName.setText("INVALID");
				}
			}
			
		});
	}

	/**
	 * Method to Split Name 
	 * @return : A boolean value corresponding to successful splitting of name 
	 */
	static boolean getSplitName() {
		// TODO Auto-generated method stub
		boolean isCharacterPresent = false;
		for(int loop = 0; loop < name.length(); loop++) {
			if((name.charAt(loop) >= 65 && name.charAt(loop) <= 90)
					|| (name.charAt(loop) >=97 && name.charAt(loop) <= 122)) {
				isCharacterPresent = true;
				break;
			}
		}
		if( !isCharacterPresent) {
			return isCharacterPresent;
		}
		lastName = name.substring(name.lastIndexOf(' ') + 1);
		firstName = name.substring(0, name.lastIndexOf(' '));
		return isCharacterPresent;
	}
}
