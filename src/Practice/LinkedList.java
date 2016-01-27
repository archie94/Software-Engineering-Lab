package Practice;

import java.util.*;
class Node{
	int data;
	Node next;
	Node(){
		data = -99;
		next = null;
	}
}
public class LinkedList {
	public static void main(String args[]){
		Node head = null;
		Scanner in = new Scanner(System.in);
		int ch;
		do{
			System.out.println("1.insert 2.display 3.terminate");
			ch = in.nextInt();
			switch(ch){
			case 1:head = insert(head,in.nextInt());
				break;
			case 2:display(head);
				break;
			}
		}while(ch!=3);
	}
	static Node insert(Node head,int num){
		Node temp = new Node();
		temp.data = num;
		if(head == null){
			head = temp;
			System.out.println("Head inserted");
			return head;
		}
		Node obj = head;
		for(;obj.next != null;obj = obj.next);
		obj.next = temp;
		System.out.println("Node inserted");
		return head;
	}
	static void display(Node head){
		Node obj = head;
		if(head == null){
			System.out.println("List empty");
			return;
		}
		for(;obj != null; obj = obj.next){
			System.out.print(obj.data + " ");
		}
		System.out.println();
	}
}
