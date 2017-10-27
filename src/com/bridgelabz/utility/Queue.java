package com.bridgelabz.utility;

	import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

	public class Queue
	{	static String stree="";
		static SinglyLinkedListImpl obj=new SinglyLinkedListImpl();
		static Deque deque = new LinkedList<String>();
		
			
			private static void Palindromche() 
			{
				
				{		
					int a,cou=0,i1,counterr=0;
					int b;
					for(i1=11;i1<=1000;i1++)
					{	String wwe="",a1="";
			         int count = 0;
			        for(int j1=2;j1<=i1/2;j1++)
			         {
			        if(i1%j1==0)
			         count++;
			        }
			       if(count==0&&i1!=0&&i1!=1)
					{	
			    	
					String wwe1 =""+i1;
					String reverse = new StringBuffer(wwe1).reverse().toString();
					if(wwe1.equals(reverse))
					{
						System.out.println(wwe1);
						counterr++;
					}
							}
					} 
					System.out.println("number of primepalindrom is"+counterr);
			}
			}
						
			
					
			
	public static void main(String args[])
	{
		Palindromche();
	}

	
	}

