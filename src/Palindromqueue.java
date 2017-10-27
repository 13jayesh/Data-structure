import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Palindromqueue
{	private static final char[][] Array2 = null;
	static int top=-1;
	static int end=-1;

	private static boolean ArrayisEmpty(char Array[]) 
	{
		
			return (Array.length==0);
	}
	private static boolean ArrayisEmpty1(char a[]) 
	{
		
			return (a.length==0);
	}
	



	public static void Enque(char Array[])
	{ 	int size=Array.length;
		char Array2[]=new char[size];
		if(ArrayisEmpty(Array))
		{
			for(int i = Array.length-1;i>=0;i--)
			{
				top++;
				
				Array2[top]=Array[i];
			}
		}
				for(int i =0;i<Array.length;i++)	
				{
				System.out.println(Array2[i]);
				
				}
				
				
				
				
//		for(int i = Array.length-1;i>=0;i--)
//		{
//			Enque(Array[i]);
//		}
//		for(int i=0;i<Array.length;i++)
//		{
//			deque(Array[i]);
//		}
//	}}deque(Array2)
	
		}
	
	public static void deque(char a2)
	{
		
		if(ArrayisEmpty1(a2))
		{
			System.out.println("the array is empty ");
		}
		else
		{
			end--;
		}
	}
	
	
	
	public static void main(String[] args)
	{
	Palindromqueue obj=new Palindromqueue();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter word");
	String str=sc.next();
	char[] Array=str.toCharArray();
	Enque(Array);

	}





}
