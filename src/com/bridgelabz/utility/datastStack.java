package com.bridgelabz.utility;
import java.util.Scanner;

public class datastStack 
{
	static SinglyLinkedListImpl obj=new SinglyLinkedListImpl();
	    private static int stackSize;
	    private String[] stackArr;
	    private static int top;
	  
	    public datastStack(int size) {
	     this.stackSize = size;
	     this.stackArr = new String[stackSize];
	     this.top = -1;
	    }
	
//	  
	    public static void pushpop(char Array[])
	    {
	    	int k=0,j=0,i;
	    	for( i = 0;i<Array.length;i++)
		{
		
			if(Array[i]=='(')
			{
				k++;
	//push
		obj.add(Array[i]);
		obj.view();
		}
			else if(Array[i]==')')
			{
	//pop
		obj.deleteElement(Array[i]);
				j++;
			
		System.out.println(Array[i]);
			}
		}	
		if(k==j)
		{
			System.out.println("Empty Array Arithmetic Expression is Balanced.");
		}
		else
		{
			System.out.println(" Parentheses is not balance");
			
		}
	
	    
	    }

	    
	   
	    

	public static void main(String[] args) 
	{	
		datastStack obj=new datastStack(stackSize);
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the equaction");
		String str=sc.next();
		char []Array=str.toCharArray();
		pushpop(Array);
		
	
	}
}
	
