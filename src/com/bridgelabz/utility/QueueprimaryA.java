package com.bridgelabz.utility;

import com.sun.xml.internal.bind.v2.model.core.Ref;

public class QueueprimaryA 
{
	
static int[] primeArray=new int[168];
static SinglyLinkedListImpl<Integer> obj=new SinglyLinkedListImpl<>();
static SinglyLinkedListImpl<Integer> obj2=new SinglyLinkedListImpl<>();
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
						obj.add(primeArray[i]);
						obj2.add(primeArray[j]);
						ob3.addAtStart(primeArray[i]);
						obj4.addAtStart(primeArray[j]);
					//System.out.println(primeArray[i]+" its anagram "+primeArray[j]);
					}

				}
			}
			
			
			
	}
	//////////////pop to pop element
	public static void POP()
	{//System.out.println(primeArray[i]+" its anagram "+primeArray[j]);
			while(obj.checkEmpty()!=0)
				System.out.println(obj.deleteFirst()+" "+obj2.deleteFirst());
			

	}public static void Deque()
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

		return digit;
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
		
		Deque();
	}
}