package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PallindromeStrings {

	static List<String> stringList;
	
	public static void takeInput() {
		stringList = new ArrayList<String>();
		int numOfString;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of strings ");
		numOfString = input.nextInt();
		for(int loop = 0; loop <= numOfString; loop++) {
			stringList.add(input.nextLine());
		}
	}
	
	public static List<String> checkForPallindromes(List<String> stringList) {
		List<String> result = new ArrayList<String>();
		for(String string : stringList) {
			if( isPallindrome(string)) {
				result.add("yes");
			}else {
				result.add("no");
			}
		}
		System.out.println(Arrays.toString(stringList.toArray()));
		System.out.println(Arrays.toString(result.toArray()));
		return result;
	}

	private static boolean isPallindrome(String string) {
		// TODO Auto-generated method stub
		String dummy = "";
		int i = string.length() - 1;
		while(i >= 0) {
			dummy = dummy + string.charAt(i);
		}
		
		return string.equals(dummy);
	}
}
