package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Scanner;
import javax.sql.RowSetListener;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
public class primenotwod 
{	
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

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("primecheacker");
			Primenumber();

		}

}


