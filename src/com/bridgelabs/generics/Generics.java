package com.bridgelabs.generics;

import java.util.Scanner;

import com.util.UtilityFunctions;

public class Generics {

	public static void main(String[] args) {
		
		/**
		 * Using generics to return the maximun value using compareTo method in datatypes
		 * different data type values are passed and the values are compared using comparedto and the maximum value is retured
		 * comparedTo is a method in class comparable this is implicitly extended in datatypes and for generics we have to explicity extend comparable class
		 */
		
		
		UtilityFunctions utilityFunctions = new UtilityFunctions<String, String, String>("y", "x", "z");  // Generic to find maximum value
		String max = utilityFunctions.compare();   // float returned is maximum value
		System.out.print("Maximum value is "+max);  // to print the maximum value
	}

}
