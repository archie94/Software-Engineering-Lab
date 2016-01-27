package Class;

import java.util.*;
public class BinarySearch {
	public static void bSearch(int[] arr,int size, int item){
		int start;
		int end;
		int mid;
		start = 0;
		end = size-1;
		Arrays.sort(arr);
		while(start<=end){
			mid = (start+end)/2;
			if(arr[mid] == item){
				System.out.println("Found at pos "+(mid+1));
				return;
			}
			else if(item > arr[mid]){
				start = mid+1;
			}
			else{
				end = mid-1;
			}
		}
		if(start>end){
			System.out.println("Not found");
		}
	}
}
