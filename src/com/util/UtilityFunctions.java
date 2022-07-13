package com.util;

public class UtilityFunctions< X extends Comparable , Y extends Comparable , Z extends Comparable> {    
	
	X x;
	Y y;
	Z z;
	
  public UtilityFunctions(X a, Y b, Z c){
	  this.x = a;
	  this.y = b;
	  this.z = c;
  }
  
  public void compare(){                           
	  
	 if(x.compareTo(y) >0 && x.compareTo(z) > 0)
		 System.out.println("Maximum value is "+x);    // to print the maximum value
	 else if(y.compareTo(x) >0 && y.compareTo(z) > 0)
		 System.out.println("Maximum value is "+y);    // to print the maximum value
	 else if(z.compareTo(x) >0 && z.compareTo(y) > 0)
		 System.out.println("Maximum value is "+z);    // to print the maximum value
  }

	}

