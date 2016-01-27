package Class;

import java.util.*;
public class BSearchUtil extends BinarySearch{
	public static void main(String args[]){
		int[] arr;
		int size;
		int item;
		int i;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter array size and then the integers in array");
		size = in.nextInt();
		arr = new int[size];
		for(i=0;i<size;i++){
			arr[i] = in.nextInt();
		}
		System.out.println("Enter number to be searched");
		item = in.nextInt();
		
		bSearch(arr,size,item);
	}
}
