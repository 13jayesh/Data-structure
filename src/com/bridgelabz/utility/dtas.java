package com.bridgelabz.utility;

import java.util.Scanner;

public class dtas {
	static Scanner scanner=new Scanner(System.in);
	static SinglyLinkedListImpl<String> obj=new SinglyLinkedListImpl<String>();
	public static <T> void main(String[] args) {
		Function();
	}
		public static void Function()
		{
			char ch;
			do{
	
			int amount=0;
		System.out.println("FOR dEQUE PRESS 1    FOR EnQUE PRESS 2");
		int choice=scanner.nextInt();
			if(choice==1)
			{
			System.out.println("Enter name of user");
			String element=scanner.next();
			/////////Adding element in queue
			obj.add(element);
			System.out.println("Dear custmer press 1 to deposite & press 2 for widraw");
			int num=scanner.nextInt();
			if(num==1)
			{
			amount=(int) (Math.random()*10000);
			System.out.println("your Account balance is "+amount);
			System.out.println("Enter amount to be doposite");
			int deposite=scanner.nextInt();
			int Balance=amount+deposite;
			System.out.println("your balance is"+Balance);
			}
			else
			{
				
				int amount1=(int) (Math.random()*10000);
				System.out.println("your Account balance is "+amount1);
				System.out.println("your Amount of Widraw is");
				int widraw=scanner.nextInt();
				int Balance=amount1-widraw;
				if(Balance>0)
			
				{
					System.out.println();
					System.out.println("your Balance is"+Balance);
				}
				else if(Balance<0)
				{
					System.out.println("you are Account having less balance");
				}
			}
			}
			else 
			{
				////////////Removing element at queues ////////
				System.out.println(obj.deleteAt(0));
				break;
			}
				
		System.out.println("  switch user ");
		ch=scanner.next().charAt(0);
		}while(ch!='n');
		}
	

}

