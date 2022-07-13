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
		
		
		UtilityFunctions utilityFunctions = new UtilityFunctions(1, 2, 3);  // Generic to find maximum value
		utilityFunctions.compare();   //  returned is maximum value
	}

}
