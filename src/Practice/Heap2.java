package Practice;

import java.io.*;
public class Heap2 {

	public static void maxHeapify(int[] heap,int currSize,int pos){
		if(pos >= currSize)
			return;
		int leftChild = 2*pos+1;
		int rightChild = 2*pos + 2;
		int largest;
		if(leftChild<heap.length && heap[leftChild]>heap[pos]){
			largest = leftChild;
		}else{
			largest = pos;
		}
		
		if(rightChild<heap.length && heap[rightChild]>heap[largest]){
			largest = rightChild;
		}
		
		if(largest != pos){
			int temp;
			temp = heap[largest];
			heap[largest] = heap[pos];
			heap[pos] = temp;
			maxHeapify(heap,currSize,largest);
		}
	}
	public static void buildMaxHeap(int[] heap,int currSize){
		int i;
		for(i=heap.length/2;i>=0;i--){
			maxHeapify(heap,currSize,i);
		}
	}
	public static void displayHeap(int[] heap,int currSize){
		int i;
		int p=1;
		for(i=0;i<currSize;i++){
			if((i+1)%((int)Math.pow(2, p)) == 0){
				System.out.print("\n"+heap[i]+" ");
				p++;
			}else{
				System.out.print(heap[i]+" ");
			}
		}
	}
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in));
		int i;
		int maxSize;
		int currSize;
		
		System.out.println("Enter maximun size of heap");
		maxSize = Integer.parseInt(br.readLine());
		int heap[] = new int[maxSize];
		System.out.println("Enter current size of heap");
		currSize = Integer.parseInt(br.readLine());
		System.out.println("Enter in array");
		for(i=0;i<currSize;i++){
			heap[i] = Integer.parseInt(br.readLine());
		}
		buildMaxHeap(heap,currSize);
		displayHeap(heap,currSize);
	}
}
