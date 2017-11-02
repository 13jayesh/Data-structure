
/******************************************************************************
*  Compilation:  javac -d bin threenames.java
*  Execution:    java -cp bin com.threenames.util.PrimeChecker n
*  
*  Purpose: program to findout the prime number using stack
*
*  @author  jayesh patil
*  @version 1.0
*  @since   11-08-2017
*
******************************************************************************/
package com.bridgelabz.utility;

import com.bridgelabz.util.SinglyLinkedListImpl;
import com.sun.xml.internal.bind.v2.model.core.Ref;

public class stackprimeA 
{
	
static int[] primeArray=new int[168];
static SinglyLinkedListImpl<Integer> ob3=new SinglyLinkedListImpl<>();
static SinglyLinkedListImpl<Integer> obj4=new SinglyLinkedListImpl<>();
	public static void primegenerator(int low,int high)
			{
			
			int k=0;
			for(int i=low;i<high;i++) {
				if(isPrime(i))
				{
					primeArray[k++]=i;
					
				}
	}
			for (int i = 0; i < primeArray.length; i++) {
			
		
				for (int j = i+1; j < primeArray.length; j++) {
					if(isAnagram(primeArray[i],primeArray[j]))
					{
						ob3.addAtStart(primeArray[i]);
						obj4.addAtStart(primeArray[j]);
					
					}

				}
			}
		}
	//////////////pop to pop element
	public static void pop()
	{
		while(ob3.checkEmpty()!=0)
			System.out.println(ob3.deleteFirst()+" "+obj4.deleteFirst());
	}
	public static  void bubbleSort(int[] arrayOne) {
		int temp;
		for(int i=0;i<arrayOne.length;i++) {
			for(int j=i+1;j<arrayOne.length;j++) {
				if(arrayOne[i]>(arrayOne[j])) {
					temp=arrayOne[j];
					arrayOne[j]=arrayOne[i];
					arrayOne[i]=temp;
				}
			}
		}
	}
	public static int[] digitConvert(int number) {
		int[] digit=new int[3];
		int k=0;
		
		while(number!=0) {
			digit[k++]=number%10;
			number=number/10;
			
		}

		return digit;//System.out.println(primeArray[i]+" its anagram "+primeArray[j]);
}
	public static int checkLength(int number)
	{ int count=0;
		while(number!=0) {
			number=number/10;
			count++;
		}
		return count;
	}
	public static boolean isAnagram(int number1,int number2)
	{
		if(checkLength(number1)!=checkLength(number2))
			return false;
		int arrayOne[]=digitConvert(number1);
		int arrayTwo[]=digitConvert(number2);
		
		bubbleSort(arrayOne);
		bubbleSort(arrayTwo);
		if(arrayOne.length!=arrayTwo.length)
		return false;
		for(int i=0;i<arrayOne.length;i++)
		{
			if(arrayOne[i]!=arrayTwo[i])
			{
				return false;
			}
			
			
		}
		return true;
	}
	private static boolean isPrime(int num) {
		int counter=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				{
				counter++;
				}
			
			
	}
		if(counter==2)
				{
					return true;
				}
				return false;	
	}
	public static void main(String args[])
	{
		primegenerator(0, 1000);
		
		pop();
	}
}
