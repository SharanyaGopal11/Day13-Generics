package com.bridgelabs.generics;

import java.util.Scanner;

import com.util.UtilityFunctions;

public class Generics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		UtilityFunctions utilityFunctions = new UtilityFunctions<Float, Float, Float>(10.45f, 90.23f, 30.89f);  // Generic to find maximum value
		Float max = utilityFunctions.compare();   // float returned is maximum value
		System.out.print("Maximum value is "+max);  // to print the maximum value
	}

}
