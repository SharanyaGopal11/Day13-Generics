package com.util;

public class UtilityFunctions<X extends Float , Y extends Float , Z extends Float> {    
	
	X x;
	Y y;
	Z z;
	
  public UtilityFunctions(X a, Y b, Z c){
	  this.x = a;
	  this.y = b;
	  this.z = c;
  }
  
  public Float compare(){                           // if i have to return a type of X, Y, Z what should be the return type
	  
	 if(x.compareTo(y) >0 && x.compareTo(z) > 0)
		 return x;
	 else if(y.compareTo(x) >0 && y.compareTo(z) > 0)
		 return y;
	 else if(z.compareTo(x) >0 && z.compareTo(y) > 0)
		 return z;
	 else
		 return (float) 0;
  }

	}

