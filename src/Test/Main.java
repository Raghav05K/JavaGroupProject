package Test;

import Interface_Impl.Calculator_Impl;
import Interface_in.Calculator;

public class Main {
	
	public static void main(String[] args) {
		
		Calculator ca =new Calculator_Impl();
	    int sum=ca.sum(10, 20);
	    System.out.println(sum);
	    
	    int mul=ca.mul(55, 55);
	    System.out.println(mul);
	    		
		
	}
	
	

}
