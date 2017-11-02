package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

///// method to find BinarySearchTree
///// 
public class utility
{public static long possibleCombinations1(int totalNodes) {
	long possibleTrees = 0;
	int count = 0;
	if (totalNodes == 1 || totalNodes == 0)
		return 1;
	else {

		while (count < totalNodes) {
			count++;
			possibleTrees = possibleTrees
					+ possibleCombinations1((int) count - 1) * possibleCombinations1((int) totalNodes - count);
		}
		return possibleTrees;
	}

}
public static long possibleCombinations(int totalNodes) {
	long possibleTrees = 0;
	int count = 0;
	if (totalNodes == 1 || totalNodes == 0)
		return 1;
	else {

		while (count < totalNodes) {
			count++;
			possibleTrees = possibleTrees
					+ possibleCombinations1((int) count - 1) * possibleCombinations1((int) totalNodes - count);
		}
		return possibleTrees;
	}
}
public static void DAYOFWEEK(int day, int month, int year)
{

int y0 = year - (14 - month) / 12;
int x = y0 + y0/4 - y0/100 + y0/400;
int m0 = month + 12 * ((14 - month) / 12) -2;
int d0 = (day + x + ((31 * m0) / 12)) % 7;

switch (d0){
	case 0: System.out.println("SUNDAY");
     break;
	case 1: System.out.println("Monday");
     break;
	case 2: System.out.println("TUESDAY");
     break;
	case 3: System.out.println("WEDNESDAY");
     break;
	case 4: System.out.println("THURSDAY");
     break;
	case 5: System.out.println("FRIDAY");
     break;
	case 7: System.out.println("SATURDAY");
     break;
}
}
static int day,year,month;
static String dayName;
static int x,y1,m1,d1;

/* this method takes day month and year from user and calculates which day falls of
* the week Returns 0 for Sunday, 1 for Monday, and so on */
public static int day(int day,int month,int year){
y1=year-(14-month)/12;
x=y1+y1/4-y1/100+y1/400;
m1=month+12*((14-month)/12)-2;
d1=(day+x+(31*m1)/12)%7;
return d1;
}

/* this method returns true if the given year is a leap year */
public static boolean isLeapYear(int year) {
if  ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return true;
return false;
}

/* this method will find day of month*/
public static String dayOfWeek1(int day,int month,int year){
d1=day(day,month,year);
switch(d1){
	case 0:dayName="Day of the week is Sunday ";
	break;
	case 1:dayName="Day of the week is Monday " ;
	break;
	case 2:dayName="Day of the week is Tuesday " ;
	break;
	case 3:dayName="Day of the week is Wednesday" ;
	break;
	case 4:dayName="Day of the week is Thursday " ;
	break;
	case 5:dayName="Day of the week is Friday " ;
	break;
	case 6:dayName="Day of the week is Saturday " ;
	break;
}	
return dayName;
}



public static void displayCalender(int month,int year)
{

String[] months = {"", "January", "February", "March","April", "May", "June",
					"July", "August", "September","October", "November", "December"};

int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//29 days in feb month if year is leap year
if (month == 2 && isLeapYear(year)) 
	days[month] = 29;

System.out.println(" " + months[month] + " " + year+"\n");
System.out.println(" S\tM\tTu\tW\tTh\tF\tS");
int startingDay = day(1, month, year);
for (int i = 0; i < startingDay; i++)
{
    System.out.print("\t");
}
for (int i = 1; i <= days[month]; i++) {
    System.out.print(i+"\t");
    if (((i + startingDay) % 7 == 0) || (i == days[month])) 
	System.out.println();
}

}
// TODO Auto-generated method stub

public static void pushpop(char Array[])
{
	SinglyLinkedListImpl obj=new SinglyLinkedListImpl();

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
public static void Function()
{
	Scanner scanner=new Scanner(System.in);
	SinglyLinkedListImpl<String> obj=new SinglyLinkedListImpl<String>();

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


public static void Hashmap()throws IOException
{		Scanner sc=new Scanner(System.in); 

	int elementFound=0;
	Scanner scanner = new Scanner(System.in);
	File file =new File("/home/bridgeit/Desktop/unorderedlist.txt");
	if(file.exists())
	{
		System.out.println("file already exist");
	}
	else
	{
		System.out.println("file created");
	}
	
	//writing a file
	FileWriter filewriter=new FileWriter("/home/bridgeit/Desktop/unorderedlist.txt");    
	filewriter.write("0,1,2,3,4,5,6,7,8,9,10");    
	filewriter.close();
    int length = (int) file.length();

	
    //reading from file
	FileReader filereader = new FileReader("/home/bridgeit/Desktop/unorderedlist.txt");

    String string= null;
    String []splitted = new String[length];
	//while ((string = bufferedreader.readLine()) != null) 
    {
        splitted = string.split(","); 
    }
    
    //adding elements to list
    LinkedList<Integer> list;
    ArrayList<Integer> Arraylist = new ArrayList<>();
    for(int i=0;i<splitted.length;i++)
    {
      Arraylist.add(Integer.parseInt(splitted[i]));
       System.out.println(splitted[i]);
    }
    
   HashMap<Integer, LinkedList<Integer>> hashMap=new HashMap<Integer, LinkedList<Integer>>();
   for(Integer integer:Arraylist){
   int slot=integer%11;
   list=hashMap.get(slot);
  //System.out.println(list);
   if(list==null)
   { 
	   list=new LinkedList<>();
	   hashMap.put(slot, list);
   }System.out.println("null valu "+list);
		list.add(slot); 
		System.out.println("value is add at list"+list);
   }
   
   System.out.println(hashMap);
   System.out.println("value");
   int val=sc.nextInt();
   int rem=val%11;
   list=hashMap.get(rem);
   if(list.contains(val))
   {
	  
	  System.out.println("element is pop"+list.pop());
	  System.out.println(hashMap);
   }
   else
   {
	   list.add(val);
	   System.out.println(hashMap);
   }
   
   
}

static int num=100,i;
static int j;
static int counter=0,k=1;
	static int Array[][]=new int [1002][1002];
	public static void Primenumber()
	{
		 while(num<1004)
		 {
		  for(i=k; i<=num;i++)
	         {
			  		counter=0;
			  		for( j = 2; j < i; j++){
	                if(i % j == 0)
	                counter++;  
	            }
			  		if(counter== 0 && i != 0 && i != 1)
			  		{
	            	Array[i][j]=i;
	            	
			  		}
			}
			
		  			k=k+100;
		  			num=num+100;		
		 }
		 			System.out.println("prime no are");
		 			int m=0,p=100;
		 			while(p<1002)
		 			{
		 				System.out.println();
		 				for(i=m;i<p;i++)
		 				{
		 					for(j=0;j<1002;j++)
		 						{
		 						if(Array[i][j]!=0)
		 							{
		 								System.out.print(" " +Array[i][j]);
		 							}
		 						}
		 				}
		 								System.out.println();
									 	m=m+100;
									 	p=p+100;
									 
		 			}	
		}

	public static void Primenumber1() {
		{
			 while(num<1004)
			 {
			  for(i=k; i<=num;i++)
		         {
				  		counter=0;
				  		for( j = 2; j < i; j++){
		                if(i % j == 0)
		                counter++;  
		            }
				  		if(counter== 0 && i != 0 && i != 1)
				  		{
		            	Array[i][j]=i;
		            	
				  		}
				}
				
			  			k=k+100;
			  			num=num+100;		
			 }
			 			System.out.println("prime no are");
			 			int m=0,p=100;
			 			while(p<1002)
			 			{
			 				System.out.println();
			 				for(i=m;i<p;i++)
			 				{
			 					for(j=0;j<1002;j++)
			 						{
			 						if(Array[i][j]!=0)
			 							{
			 								System.out.print(" " +Array[i][j]);
			 							}
			 						}
			 				}
			 								System.out.println();
										 	m=m+100;
										 	p=p+100;
										 
			 			}	
			}
	}


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
		public static void unorderedList() throws IOException
		{
			SinglyLinkedListImpl obj=new SinglyLinkedListImpl();

			int elementFound=0;
			Scanner scanner = new Scanner(System.in);
			File file =new File("/home/bridgeit/Desktop/unorderedlist.txt");
			if(file.exists())
			{
				System.out.println("file already exist");
			}
			else
			{
				System.out.println("file created");
			}
			
			//writing a file
			FileWriter filewriter=new FileWriter("/home/bridgeit/Desktop/unorderedlist.txt");    
			filewriter.write("my,name ,is,jayesh ,mj,jaya");    
			filewriter.close();
	        int length = (int) file.length();

			
	        //reading from file
			FileReader filereader = new FileReader("/home/bridgeit/Desktop/unorderedlist.txt");
		    BufferedReader bufferedreader = new BufferedReader(filereader);
			
		    String string= null;
		    String []splitted = new String[length];
		    while ((string = bufferedreader.readLine()) != null) 
		    {
	            splitted = string.split(",");
	        }
	        
	        //adding elements to list
	        ArrayList<String> list = new ArrayList<String>();
	        for(int i=0;i<splitted.length;i++)
	        {
	           obj.add(splitted[i]);
	        }
	        System.out.println();
	    
	        System.out.println();
	        
	        Arrays.sort(splitted);
	        for(String i: splitted)
	        {
	        	System.out.println(i);
	        }
	        
	        //user input to search a word
	        System.out.println("enter a word to search");
	        String search= scanner.next();
	        
	        int min = 0;
			int max = splitted.length - 1;
			int mid = (min + max) /2;
			
			for(int i=0;i<splitted.length;i++)
			{
					if(search.compareTo(splitted[mid])==0)
					{
						elementFound = 1;
						obj.deleteElement(search);
						obj.view();
						break;
					}
					else if(search.compareTo(splitted[mid]) < 0)
					{
						max = mid-1;
						mid = (min+max)/2;
					}
					
					else
					{
						min = mid +1;
						mid = (min+max)/2;
					}
			}
			if(elementFound!=1)
			{
				obj.add(search);
				obj.view();

			}
			
			System.out.println(list);
			
	        
	        
		}
	}






	
