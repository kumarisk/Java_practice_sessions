package com.Basic_Programs;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		/*
		 	153 = (1*1*1)+(5*5*5)+(3*3*3)  
				where:  
				(1*1*1)=1  
				(5*5*5)=125  
				(3*3*3)=27  
				So:  
				1+125+27=153  
		 */
		
		 int c=0,a,temp;  
		    int n=153;//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   

	}

}
