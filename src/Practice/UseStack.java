package Practice;

import java.util.*;
class Stack {
	int arr[];
	int top;
	int size;
	public Stack(){
		top = -1;
		System.out.println("Enter size of stack");
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		arr = new int[size];
	}
	public void push(int x){
		if(top + 1 == size){
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top] = x;
	}
	public int pop(){
		if(top == -1){
			System.out.println("Stack Underflow");
			return -9099; // an unlikely value
		}
		return arr[top--];
	}
	public void displayStack(){
		if(top == -1){
			System.out.println("Stack Underflow");
			return;
		}
		for(int i = top;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
public class UseStack{
	public static void main(String args[]){
		Stack stack = new Stack();
		int ch;
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("1.Push 2.Pop 3.Display 4.Terminate");
			ch = in.nextInt();
			switch(ch){
			case 1:stack.push(in.nextInt());
				break;
			case 2:System.out.println("Poped from stack "+stack.pop());
				break;
			case 3:stack.displayStack();
				break;
			case 4:System.exit(0);
			}
		}
	}
}