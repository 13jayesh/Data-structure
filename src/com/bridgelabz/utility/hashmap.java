package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;




public class hashmap {
	static SinglyLinkedListImpl<Integer> obj1=new SinglyLinkedListImpl<>();
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) throws IOException {
		
		Hashmap();
	}
	public static void Hashmap()throws IOException
	{
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
	    BufferedReader bufferedreader = new BufferedReader(filereader);
		
	    String string= null;
	    String []splitted = new String[length];
	    while ((string = bufferedreader.readLine()) != null) 
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
       HashMap<Integer, LinkedList<Integer>> hashMap=new HashMap<>();
       for(Integer integer:Arraylist){
       int slot=integer%11;
       list=hashMap.get(slot);
       //System.out.println(list);
       if(list==null)
       { 
    	   list=new LinkedList<>();
    	   hashMap.put(slot, list);
       }System.out.println(list);
    		list.add(integer);   
        
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
}

//	    //adding elements to list
//        ArrayList<String> list = new ArrayList<String>();
//        for(int i=0;i<splitted.length;i++)
//        {
//           obj1.add(splitted[i]);
//        }
//        System.out.println();
//    
//        System.out.println();
//        
//        Arrays.sort(splitted);
//        for(String i: splitted)
//        {
//        	System.out.println(i);
//        }
//        AddRemove(splitted);
//	}
//         
//	
//	public static void AddRemove(String splitted[])
//        {
//        	int elementFound=0;
//        //user input to search a word
//        	int[] Array2=new int[10];
//        System.out.println("enter a number to be found ");
//        String search= sc.next();
//        
//        int min = 0;
//		int max = splitted.length - 1;
//		int mid = (min + max) /2;
//		
//		for(int i=0;i<splitted.length;i++)
//		{
//				if(search.compareTo(splitted[mid])==0)
//				{
//					elementFound = 1;
//					obj1.deleteElement(splitted);
//					for(int i1=0;i1<splitted.length;i1++)
//					{
//					Array2[i1]=String.valueOf(i1);
//					}obj1.view();
//					
//					AddRemove(splitted);
//					Reminder(search);
//					
//					break;
//				}
//				else if(search.compareTo(splitted[mid]) < 0)
//				{
//					max = mid-1;
//					mid = (min+max)/2;
//				}
//				
//				else
//				{
//					min = mid +1;
//					mid = (min+max)/2;
//				}
//		}
//		if(elementFound!=1)
//		{
//			obj1.add(search);
//			obj1.view();
//			AddRemove(splitted);
//			
//		}
//		
//		
//        
//        
//	}
//		private static void Reminder(String search)
//		{
//		int Reminder=search%11;
//		
//
//			
//		}
//   
//	}
