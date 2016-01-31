package Practice;

import java.io.*;
public class Heap {

	public static void insertHeap(int[] heap,int currSize,int num){
		// implementing min heap
		int parentPos;
		int currPos;
		heap[currSize] = num;
		parentPos = currSize/2;
		currPos = currSize;
		while(heap[parentPos]>heap[currPos] && parentPos>=1){
			int temp = heap[currPos];
			heap[currPos] = heap[parentPos];
			heap[parentPos] = temp;
			currPos = parentPos;
			parentPos/=2;
		}
	}
	public static void display(int[] heap,int currSize){
		int i;
		int p = 1;
		for(i=1;i<currSize;i++){
			if(i%((int)Math.pow(2.0, p*1.0)) == 0){
				System.out.print("\n"+heap[i]+" ");
				p++;
			}else{
				System.out.print(heap[i]+" ");
			}
		}
	}
	public static void extractMin(int[] heap,int currSize){
		int parentPos;
		int childPos1;
		int childPos2;
		System.out.println("Minimum extracted " + heap[1] );
		heap[1] = heap[currSize-1];
		currSize--;
		parentPos = 1;
		childPos1 = 2*parentPos;
		childPos2 = 2*parentPos + 1;
		while((heap[parentPos] > heap[childPos1] || heap[parentPos] > heap[childPos2]) && 
				parentPos<=currSize && (childPos1<currSize || childPos2<currSize)){
			int temp;
			int swapPos;
			// swap with the smallest of the 2 children
			if(heap[childPos1] > heap[childPos2]){
				swapPos = childPos2;
			}else{
				swapPos = childPos1;
			}
			temp = heap[parentPos];
			heap[parentPos] = heap[swapPos];
			heap[swapPos] = temp;
			parentPos = swapPos;
			childPos1 = 2*parentPos;
			childPos2 = 2*parentPos + 1;
		}
	}
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new 
				InputStreamReader(System.in));
		int heap[] = new int[1000]; // max size of heap is 1000 nodes
		int currSize = 1;
		int choice;
		do{
			System.out.println("\n1.Insert in heap 2.Extract min 3.Display heap 4.Terminate\nEnter choice");
			choice = Integer.parseInt(br.readLine());
			switch(choice){
			case 1:insertHeap(heap,currSize,Integer.parseInt(br.readLine()));
				currSize++;
				break;
			case 2:extractMin(heap,currSize);
				currSize--;
				break;
			case 3:display(heap,currSize);
				break;
			}
		}while(choice!=4);
	}
}