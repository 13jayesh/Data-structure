
/******************************************************************************
*  Compilation:  javac -d bin threenames.java
*  Execution:    java -cp bin com.threenames.util.PrimeChecker n
*  
*  Purpose: program to search BinarySearchTree.
*
*  @author  jayesh patil
*  @version 1.0
*  @since   11-08-2017
*
******************************************************************************/

package com.bridgelabz.utility;

import java.util.Scanner;

import com.bridgelabz.util.utility;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;
public class BinarySearchTreeFind {
	utility  object=new utility();

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int number = Integer.parseInt(scanner.nextLine());
		long result = utility.possibleCombinations1(number);
		System.out.println(result);
		scanner.close();
	}

}