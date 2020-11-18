package com.Basic_Programs;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Generate_Random_Number {
	
/*
 	Using the Math.random() Method
 	
 	The Java Math class has many methods for different mathematical operations. One of them is 
 	the random() method. It is a static method of the Math class. We can invoke it directly. It 
 	generates only double type random number greater than or equal to 0.0 and less than 1.0. Before 
 	using the random() method, we must import the java.lang.Math class.

		Syntax:
		
			public static double random()  
 */

	public static void main(String[] args) {
		
		System.out.println("1st Random Number: " + Math.random());   
		System.out.println("2nd Random Number: " + Math.random());  
		System.out.println("3rd Random Number: " + Math.random());   
		System.out.println("4th Random Number: " + Math.random());   
		
		System.out.println("======================second method output=================" );
		range();
		System.out.println("======================third method output===================" );
		tet();
		System.out.println("==========================fourth method output=====================" );
		test();
		System.out.println("======================fifth method output========================" );
		tests();

	}
	
//Let's create a program that generates random numbers between 200 to 400.
	
	public static void range(){
		int min = 200;  
		int max = 400;  
		//Generate random double value from 200 to 400   
		System.out.println("Random value of type double between "+min+" to "+max+ ":");  
		double a = Math.random()*(max-min+1)+min;   
		System.out.println(a);  
		//Generate random int value from 200 to 400   
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);  
	}
	
	public static void tet(){
		
		// creating an object of Random class   
		Random random = new Random();   
		// Generates random integers 0 to 49  
		int x = random.nextInt(50);   
		// Generates random integers 0 to 999  
		int y = random.nextInt(1000);   
		// Prints random integer values  
		System.out.println("Randomly Generated Integers Values");  
		System.out.println(x);   
		System.out.println(y);   
		// Generates Random doubles values  
		double a = random.nextDouble();   
		double b = random.nextDouble();   
		// Prints random double values  
		System.out.println("Randomly Generated Double Values");  
		System.out.println(a);   
		System.out.println(b);    
		// Generates Random float values  
		float f=random.nextFloat();  
		float i=random.nextFloat();  
		// Prints random float values  
		System.out.println("Randomly Generated Float Values");  
		System.out.println(f);   
		System.out.println(i);   
		// Generates Random Long values  
		long p = random.nextLong();   
		long q = random.nextLong();   
		// Prints random long values  
		System.out.println("Randomly Generated Long Values");  
		System.out.println(p);   
		System.out.println(q);    
		// Generates Random boolean values  
		boolean m=random.nextBoolean();  
		boolean n=random.nextBoolean();  
		// Prints random boolean values  
		System.out.println("Randomly Generated Boolean Values");  
		System.out.println(m);   
		System.out.println(n);   
	}
	
	public static void test(){
		
		// Generate random integers between 0 to 999   
		int a = ThreadLocalRandom.current().nextInt();   
		int b = ThreadLocalRandom.current().nextInt();   
		// Print random integer values  
		System.out.println("Randomly Generated Integer Values:");  
		System.out.println(a);   
		System.out.println(b);   
		// Generate Random double values  
		double c = ThreadLocalRandom.current().nextDouble();   
		double d = ThreadLocalRandom.current().nextDouble();   
		// Print random doubles   
		System.out.println("Randomly Generated Double Values:");  
		System.out.println(c);   
		System.out.println(d);   
		// Generate random boolean values  
		boolean e = ThreadLocalRandom.current().nextBoolean();   
		boolean f = ThreadLocalRandom.current().nextBoolean();   
		// Print random Booleans   
		System.out.println("Randomly Generated Boolean Values:");  
		System.out.println(e);   
		System.out.println(f);   
	}
	
	public static void tests(){
		
		randomInts(5);  
		randomInts(9, 50, 90);  
		//getStreamOfRandomInts(30, 50);  
		}   
		//method that generates a stream of integers having size 5  
		public static void randomInts(int num)   
		{  
		Random random = new Random();  
		random.ints(num).forEach(System.out::println);  
		}  
		//method that generates a stream of 9 integers between 50 to 90  
		public static void randomInts(int num, int origin, int bound)   
		{  
		Random random1 = new Random();  
		random1.ints(num, origin, bound).forEach(System.out::println);  
	}

}
