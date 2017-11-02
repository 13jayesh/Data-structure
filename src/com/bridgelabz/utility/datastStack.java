
/******************************************************************************
*  Compilation:  javac -d bin threenames.java
*  Execution:    java -cp bin com.threenames.util.PrimeChecker n
*  
*  Purpose: program to cheack the Balanced equaction.
*
*  @author  jayesh patil
*  @version 1.0
*  @since   11-08-2017
*
******************************************************************************/
package com.bridgelabz.utility;
import java.util.Scanner;

import com.bridgelabz.util.SinglyLinkedListImpl;
import com.bridgelabz.util.utility;

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
	   

	public static void main(String[] args) 
	{	
		datastStack obj=new datastStack(stackSize);
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the equaction");
		String str=sc.next();
		char []Array=str.toCharArray();
		utility.pushpop(Array);
		
	
	}
}
	
