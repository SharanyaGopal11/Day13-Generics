package com.bridgelabs.generics;

import java.util.Scanner;

import com.util.UtilityFunctions;

public class Generics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		UtilityFunctions utilityFunctions = new UtilityFunctions<Integer, Integer, Integer>(10, 90, 30);  // Generic to find maximum value
		Integer max = utilityFunctions.compare();   // integer returned is maximum value
		System.out.print("Maximum value is "+max);  // to print the maximum value
	}

}
