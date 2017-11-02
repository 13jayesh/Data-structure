

/******************************************************************************
*  Compilation:  javac -d bin threenames.java
*  Execution:    java -cp bin com.threenames.util.PrimeChecker n
*  
*  Purpose: program to findout unorderlist
*
*  @author  jayesh patil
*  @version 1.0
*  @since   11-08-2017
*
******************************************************************************/package com.bridgelabz.utility;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.Element;

import com.bridgelabz.util.SinglyLinkedListImpl;
import com.bridgelabz.util.utility;

public class UnOrderedList {
	static SinglyLinkedListImpl obj=new SinglyLinkedListImpl();
	public static void main(String args[]) throws IOException
	{
		utility.unorderedList();
	}
	
}