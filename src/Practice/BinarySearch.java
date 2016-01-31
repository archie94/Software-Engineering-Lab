package Practice;

import java.util.Scanner;
public class BinarySearch {
	public static void main(String args[]){
		int size; // store size of array
		int start;
		int end;
		int middle;
		int searchElement;
		int array[];
		int i;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		size = in.nextInt();
		array = new int[size];
		
		System.out.println("Enter the numbers(integer)");
		for(i=0; i<size; i++){
			array[i] = in.nextInt();
		}
		start = 0;
		end = size-1;
		middle = (start+end)/2;
		
		System.out.println("Enter element to be searched");
		searchElement = in.nextInt();
		while(start<=end){
			if(array[middle]==searchElement){
				System.out.println("Found at position "+middle);
				break;
			}else if(searchElement > array[middle]){
				start = middle+1;
			}else{
				end = middle-1;
			}
			middle = (start+end)/2;
		}
		if(start>end){
			System.out.println("Search item not found");
		}
	}
}
