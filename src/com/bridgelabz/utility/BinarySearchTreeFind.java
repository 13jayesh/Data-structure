

package com.bridgelabz.utility;

import java.util.Scanner;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;
public class BinarySearchTreeFind {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int number = Integer.parseInt(scanner.nextLine());
		long result = possibleCombinations1(number);
		System.out.println(result);
		scanner.close();
	}

	public static long possibleCombinations1(int totalNodes) {
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
}